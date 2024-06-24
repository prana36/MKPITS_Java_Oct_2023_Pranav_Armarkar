package com.mkpits.bank.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferRequestDto
{
    private Integer senderUserId;
    private Integer receiverUserId;
    private double amount;
}
