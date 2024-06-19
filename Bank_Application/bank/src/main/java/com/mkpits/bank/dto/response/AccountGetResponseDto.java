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
public class AccountGetResponseDto {
//    private  Integer id ;
    private Integer userId ;
    private String accountType;
    private String balance;
    private String rateOfIntrest ;
    private Integer updatedBy;
    private LocalDateTime updatedAt ;
}
