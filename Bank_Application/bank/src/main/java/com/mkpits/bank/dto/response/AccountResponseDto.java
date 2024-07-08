package com.mkpits.bank.dto.response;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountResponseDto {
    private Integer id;
    private Integer userId;
    private String accType;
    private Double balance;
    private String accNo;
    private Double rateOfInterest;
    private Integer branchId;
    private LocalDate openingDate;
//    private LocalDate closingDate;
}
