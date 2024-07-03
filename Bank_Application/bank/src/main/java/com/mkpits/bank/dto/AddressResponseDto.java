package com.mkpits.bank.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponseDto {
    private Integer userId;

    private String address;

    private String pinCode;
}
