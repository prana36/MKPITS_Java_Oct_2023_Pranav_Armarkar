package com.example.demo.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter // this Annotation will be generated  The setter method .
@Getter // this Annotation will be generated  The getter method
@NoArgsConstructor // this Annotation will be generated  The No Arguments constructor
@AllArgsConstructor // this Annotation will be generated  The  Arguments constructor
public class UserPostResponseDto {

    private Integer id ;
    private String firstName ;
    private String middleName;
    private String lastName ;
    private String userName ;
}
