package com.django.inscription.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidate")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Candidate extends Base{

    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    @Email
    private String email;
    private String phone;
    private String actualLocation;
    private Integer idNumber;
    private String province;
    private String commune;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;
    private String birthPlace;
    private String contre;
    private int numberOfChild;
    private String matrimonialStatus;
    private String helpPersonne;
    private String hightSchoolLevel;
    private String otherInformation;
    @Lob
    private String picture;
    @Lob
    private String cni;
    @Lob
    private String degree;
    @Lob
    private String certificateOfGoodConduct;
    @Lob
    private String birthCertificate;
    @Lob
    private String certificateOfPhysicalFitness;
    private List<String>practicalLangages=new ArrayList<>();





}
