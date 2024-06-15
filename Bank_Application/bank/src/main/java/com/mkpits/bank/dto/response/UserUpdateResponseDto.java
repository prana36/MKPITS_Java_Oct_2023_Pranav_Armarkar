package com.mkpits.bank.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserUpdateResponseDto
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
//    private Integer createdBy;
//    private LocalDateTime createdAt ;
//    private Integer updatedBy;
//    private LocalDateTime updatedAt;

}
