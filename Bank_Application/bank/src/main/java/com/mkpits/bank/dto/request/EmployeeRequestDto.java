package com.mkpits.bank.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeRequestDto
{
    private Integer id;
    private String fullName;
    private String mobile;
    private String email;
    private String gender;
    private LocalDate dateOfBirth;
    private String aadharNo;
    private String address;
    private String state;
    private String city;

    private String password;

    private String pinCode;
    private String userName;
}
