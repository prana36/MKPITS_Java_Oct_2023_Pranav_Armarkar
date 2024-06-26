package com.mkpits.bank.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGetResponseDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String mobileNo;
    private LocalDate dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String zipCode;


   //Account details
    private Integer accountId ;
    private String accountType;
    private String balance;
    private String rateOfIntrest ;

}

