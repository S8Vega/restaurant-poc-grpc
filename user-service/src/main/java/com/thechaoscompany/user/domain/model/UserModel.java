package com.thechaoscompany.user.domain.model;

import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private RoleModel role;
}
