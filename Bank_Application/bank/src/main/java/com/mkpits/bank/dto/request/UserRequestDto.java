package com.mkpits.bank.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto {

    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String aadharNo;

    //
    private String address;

    //for credentails

    private String pinCode;
    private String userName;
    //
    private String accType;
    private String password;
    private String passwordSalt;
}
