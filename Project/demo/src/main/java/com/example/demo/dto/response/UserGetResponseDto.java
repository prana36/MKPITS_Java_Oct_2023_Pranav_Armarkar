package com.example.demo.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Builder
@Setter // this Annotation will be generated  The setter method .
@Getter // this Annotation will be generated  The getter method
@NoArgsConstructor // this Annotation will be generated  The No Arguments constructor
@AllArgsConstructor // this Annotation will be generated  The  Arguments constructor
@JsonInclude(JsonInclude.Include.NON_NULL) // To avoid  Null value in bellow attribute
public class UserGetResponseDto
{
    private  Integer id;
    private String firstName ;
    private String middleName;
    private String lastName ;
    private String userName ;
    private String email;
    private String mobile;
    private LocalDate dateOfBirth;
    private String adhaarNo;
    private String gender ;

}
