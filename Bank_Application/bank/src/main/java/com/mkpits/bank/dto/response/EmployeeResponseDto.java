package com.mkpits.bank.dto.response;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponseDto {

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
}
