package com.mkpits.bank.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonInclude(JsonInclude.Include.NON_NULL)
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

//    private List<AccountsRequestDto> accounts;

    //
    private Integer userId ;
    private String accountType;
    private Double balance;
    private String rateOfIntrest ;

}
