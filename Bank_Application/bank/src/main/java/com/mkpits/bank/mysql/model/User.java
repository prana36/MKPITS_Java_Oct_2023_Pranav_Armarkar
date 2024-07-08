package com.mkpits.bank.mysql.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "mobile_number")
    private String mobile;
    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;


    @Column(name = "date_of_birth")
    private String dateOfBirth;


    @Column(name = "cin")
    private String cin;

    @Column(name = "adhaar_card")
    private String aadharNo;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private Integer createdBy;
}
