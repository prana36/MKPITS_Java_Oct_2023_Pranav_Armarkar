package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountUpdateResponseDto;

public interface IAccountService{

    AccountGetResponseDto getAccount(Integer userId);

    AccountUpdateResponseDto updateAccount(AccountsRequestDto accountsRequestDto);

    AccountsRequestDto deleteUser(Integer userId);
}
