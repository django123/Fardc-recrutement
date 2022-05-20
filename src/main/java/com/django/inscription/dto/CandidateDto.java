package com.django.inscription.dto;

import com.django.inscription.entities.Gender;
import lombok.Data;

@Data
public class CandidateDto {

    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String email;
    private String phone;
    private String province;
    private String commune;
    private String gender;
}
