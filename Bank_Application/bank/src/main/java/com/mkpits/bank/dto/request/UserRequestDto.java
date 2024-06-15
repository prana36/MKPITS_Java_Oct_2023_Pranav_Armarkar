package com.mkpits.bank.dto.request;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto
{
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender ;
    private  String email ;
    private String mobileNo;
    private LocalDate dateOfBirth ;
    private String address;
    private String  city;
    private String  state;
    private String  zipCode ;
    private Integer createdBy;
    private LocalDateTime createdAt ;
    private Integer updatedBy;
    private LocalDateTime updatedAt;

}
