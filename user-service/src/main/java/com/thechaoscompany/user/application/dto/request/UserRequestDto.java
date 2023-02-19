package com.thechaoscompany.user.application.dto.request;

import lombok.Data;

@Data
public class UserRequestDto {
    private Long id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private String nameRole;
    private String descriptionRole;
}
