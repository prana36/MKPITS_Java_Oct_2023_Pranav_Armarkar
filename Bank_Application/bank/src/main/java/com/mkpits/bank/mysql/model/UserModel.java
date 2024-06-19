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
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="gender")
    private String gender ;
    @Column(name="email")
    private  String email ;
    @Column(name="mobile_no")
    private String mobileNo;
    @Column(name="date_of_birth")
    private LocalDate dateOfBirth ;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipCode ;
    @Column(name="created_by")
    private Integer createdBy;
    @Column(name="created_at")
    private LocalDateTime createdAt ;
    @Column(name="updated_by")
    private Integer updatedBy;
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

}
