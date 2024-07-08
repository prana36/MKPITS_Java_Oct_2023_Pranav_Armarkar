package com.mkpits.bank.dto.response;

import lombok.*;

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
    private String gender;
    private String dateOfBirth;
    private String cin;
    private String aadharNo;

    // for credentials
    private String address;
    private String pinCode;
    private String userName;
    private String accType;

}
