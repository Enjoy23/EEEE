package ru.kata.spring.boot_security.demo.servises;

import ru.kata.spring.boot_security.demo.dto.RoleDTO;
import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Optional;
import java.util.Set;

public interface RoleService {
    void saveAll(Set<Role> roles);
    Set<Role> findAllRoles();

    Role convertToRole(RoleDTO roleDTO);

    RoleDTO convertToRoleDTO(Role role);
}
