package com.mkpits.bank.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountsRequestDto {

    private Integer accountId ;
    private  Integer userId;
    private String accountType;
    private Double balance;
    private String rateOfIntrest ;
    private Integer updatedBy;
    private LocalDateTime updatedAt ;
}
