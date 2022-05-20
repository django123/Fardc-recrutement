package com.django.inscription.dto;

import com.django.inscription.entities.Role;
import lombok.Data;

@Data
public class UserDto {

    private String id;
    private String email;
    private String matricule;
    private String password;
    private String phone;
    private String role;
}
