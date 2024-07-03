package com.mkpits.bank.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private Character gender;
    private LocalDate dateOfBirth;
    private String cin;
    private String aadharNo;

}
