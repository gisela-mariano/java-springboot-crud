package java_springboot_crud.services;

import java_springboot_crud.models.User;

import java.util.UUID;

public interface UserService {
    Iterable<User> fetchAll();

    User findById(UUID id);

    User create(User user);

    User update(UUID id, User user);

    boolean delete(UUID id);
}
