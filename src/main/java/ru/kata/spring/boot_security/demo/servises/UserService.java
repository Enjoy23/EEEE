package ru.kata.spring.boot_security.demo.servises;

import ru.kata.spring.boot_security.demo.dto.UserDTO;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.*;

public interface UserService {
    void save(User user);

    List<User> findAllUsers();

    void update(int id, User updateUser);

    void delete(int id);

    Optional<User> findUser(int id);

    Optional<User> userByUsername(String username);

    User convertToUser(UserDTO userDTO);

    UserDTO convertToDTO(User user);

}
