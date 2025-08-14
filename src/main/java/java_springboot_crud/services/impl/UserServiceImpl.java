package java_springboot_crud.services.impl;

import java_springboot_crud.adapters.AddressAdapter;
import java_springboot_crud.dtos.AddressViaCepDTO;
import java_springboot_crud.models.Address;
import java_springboot_crud.models.User;
import java_springboot_crud.repositories.AddressRepository;
import java_springboot_crud.repositories.UserRepository;
import java_springboot_crud.services.UserService;
import java_springboot_crud.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AddressAdapter addressAdapter;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<User> fetchAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(UUID id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public User create(User user) {
        return saveUserWithAddress(user);
    }

    @Override
    public User update(UUID id, User user) {
        Optional<User> userDb = userRepository.findById(id);

        if (userDb.isPresent()) {
            saveUserWithAddress(user);
        }

        return userDb.get();
    }

    @Override
    public boolean delete(UUID id) {
        userRepository.deleteById(id);
        return true;
    }

    private User saveUserWithAddress(User user) {
        String cep = user.getAddress().getCep();

        Address address = addressRepository.findById(cep).orElseGet(() -> {
            AddressViaCepDTO newAddressDTO = viaCepService.fetchCep(cep);
            Address newAddress = addressAdapter.toAddress(newAddressDTO);
            addressRepository.save(newAddress);
            return newAddress;
        });

        user.setAddress(address);
        userRepository.save(user);

        return user;
    }
}
