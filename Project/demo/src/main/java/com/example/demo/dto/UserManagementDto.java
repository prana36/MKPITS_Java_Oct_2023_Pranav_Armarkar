package com.example.demo.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Setter // this Annotation will be generated  The setter method .
@Getter // this Annotation will be generated  The getter method
@NoArgsConstructor // this Annotation will be generated  The No Arguments constructor
@AllArgsConstructor // this Annotation will be generated  The  Arguments constructor
public class UserManagementDto
{

    private Integer id ;
    private String firstName ;
    private String middleName;
    private String lastName ;
    private String mobile;
    private String email;
    private String dateOfBirth;
    private String  adhaarNo;
    private String gender ;
    private Timestamp createdBy;
    private Integer createdAt;
    private Timestamp  updatedBy;
    private Integer updatedAt;

}
