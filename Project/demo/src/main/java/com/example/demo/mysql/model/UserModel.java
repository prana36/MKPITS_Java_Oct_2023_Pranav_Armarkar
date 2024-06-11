package com.example.demo.mysql.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter // this Annotation will be generated  The setter method .
@Getter // this Annotation will be generated  The getter method
@NoArgsConstructor // this Annotation will be generated  The No Arguments constructor
@AllArgsConstructor // this Annotation will be generated  The  Arguments constructor
@Builder
@Entity
@Table(name = "user_details")
public class UserModel
{
    @Id // Id is Primary Key That's Why This Annotation is declared.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  //this annotation is used to  specify the below variable having name in dataBase Column is id.
    private Integer id ;

    @Column(name = "first_name") //this annotation is used to  specify the below variable having name in dataBase Column is first_name.
    private String firstName ;

    @Column(name = "middle_name")  //this annotation is used to  specify the below variable having name in dataBase Column is middle_name.
    private String middleName;

    @Column(name = "last_name")  //this annotation is used to  specify the below variable having name in dataBase Column is last_name.
    private String lastName ;


    @Column(name = "mobile") //this annotation is used to  specify the below variable having name in dataBase Column is mobile.
    private String mobile;

    @Column(name = "email") //this annotation is used to  specify the below variable having name in dataBase Column is email.
    private String email;

    @Column(name = "date_of_birth") //this annotation is used to  specify the below variable having name in dataBase Column is date_of_birth.
    private LocalDate dateOfBirth;

    @Column(name = "adhaar_no") //this annotation is used to  specify the below variable having name in dataBase Column is adhaar_no.
    private String  adhaarNo;

    @Column(name = "gender")  //this annotation is used to  specify the below variable having name in dataBase Column is gender.
    private String gender ;

    @Column(name = "created_by") //this annotation is used to  specify the below variable having name in dataBase Column is created_by.
    private Integer createdBy;

    @Column(name = "created_at") //this annotation is used to  specify the below variable having name in dataBase Column is created_at.
    private LocalDateTime createdAt;

    @Column(name = "updated_by") //this annotation is used to  specify the below variable having name in dataBase Column is updated_by.
    private Integer  updatedBy;

    @Column(name = "updated_at") //this annotation is used to  specify the below variable having name in dataBase Column is updated_at.
    private LocalDateTime updatedAt;



}
