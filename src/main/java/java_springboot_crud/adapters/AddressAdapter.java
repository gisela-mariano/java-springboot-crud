package java_springboot_crud.adapters;

import java_springboot_crud.dtos.AddressViaCepDTO;
import java_springboot_crud.models.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressAdapter {

    public Address toAddress(AddressViaCepDTO dto) {
        if (dto == null) return null;

        Address address = new Address();

        address.setCep(dto.getCep());
        address.setStreet(dto.getLogradouro());
        address.setNeighborhood(dto.getBairro());
        address.setLocality(dto.getLocalidade());
        address.setComplement(dto.getComplemento());
        address.setState(dto.getEstado());
        address.setUf(dto.getUf());

        return address;
    }
}
