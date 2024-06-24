package com.mkpits.bank.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountUpdateResponseDto {

    private Integer accountId ;
    private  Integer UserId ;
    private String accountType;
    private Double balance;
    private String rateOfIntrest ;
//    private Integer updatedBy;
//    private LocalDateTime updatedAt ;
}
