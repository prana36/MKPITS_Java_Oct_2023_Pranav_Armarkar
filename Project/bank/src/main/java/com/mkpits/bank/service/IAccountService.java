package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.request.TransferRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountPostResponseDto;
import com.mkpits.bank.dto.response.AccountUpdateResponseDto;
import com.mkpits.bank.dto.response.MoneyTransferResponseDto;

public interface IAccountService{

    AccountGetResponseDto getAccount(Integer accountId);

    AccountPostResponseDto addAccounts(AccountsRequestDto accountsRequestDto);

    AccountUpdateResponseDto updateAccount(AccountsRequestDto accountsRequestDto);

    AccountsRequestDto deleteUser(Integer userId);

    MoneyTransferResponseDto amountTransfer(TransferRequestDto transferRequest, Integer senderUserId);

//    MoneyTransferResponseDto amountTransfer(TransferRequestDto transferRequest, Integer senderUserId);
}
