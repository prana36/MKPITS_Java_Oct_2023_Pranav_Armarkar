package com.mkpits.bank.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponseDto {

    private int httStatusCode;
    private String errorMessage;
}
