package com.django.inscription.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor @NoArgsConstructor
public class User extends Base{



    private String matricule;

    @Email
    private String email;

    private String password;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String centre;

    @Lob
    private String profile;
}
