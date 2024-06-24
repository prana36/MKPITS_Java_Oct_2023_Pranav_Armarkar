package com.mkpits.bank.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MoneyTransferResponseDto {
    private Integer senderId;
    private Integer receiverId;
    private double transferredAmount;
    private double senderBalance;
    private double receiverBalance;
}
