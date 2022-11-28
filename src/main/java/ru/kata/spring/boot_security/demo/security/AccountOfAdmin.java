package ru.kata.spring.boot_security.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.servises.RoleService;
import ru.kata.spring.boot_security.demo.servises.UserService;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * password - admin
 */
@Component
public class AccountOfAdmin {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public AccountOfAdmin(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void admin() {
        User admin = new User("Roman","Markov",
                "admin", 20, "admin");
        Role roleUser  = new Role("ROLE_USER");
        Role roleAdmin  = new Role("ROLE_ADMIN");
        if (userService.userByUsername(admin.getUsername()).isEmpty()) {
            admin.setRoleList(new HashSet<>(Set.of(roleUser, roleAdmin)));
            roleService.saveAll(new HashSet<>(Set.of(roleUser, roleAdmin)));
            userService.save(admin);
        }
    }
}
