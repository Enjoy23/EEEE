package ru.kata.spring.boot_security.demo.dto;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public class RoleDTO {
    private Integer id;
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
