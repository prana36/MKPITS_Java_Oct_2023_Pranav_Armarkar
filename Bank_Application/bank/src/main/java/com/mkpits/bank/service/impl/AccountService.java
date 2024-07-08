package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.mysql.model.Account;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<AccountResponseDto> getAllUserAccounts(Integer userId) {
        List<Account> accountList = accountRepository.findAccountsByUserId(userId);
        List<AccountResponseDto> accountResponceDtoList = new ArrayList<>();
        for (Account account : accountList){
            AccountResponseDto accountResponceDto = convertUserModelToUserDto(account);
            accountResponceDtoList.add(accountResponceDto);
        }


        return accountResponceDtoList;
    }

    private AccountResponseDto convertUserModelToUserDto(Account account) {
        AccountResponseDto responceDto= AccountResponseDto.builder()
                .accType(account.getAccType())
                .accNo(account.getAccNo())
                .balance(account.getBalance())
                .openingDate(account.getOpeningDate())
                .build();
        return responceDto;
}

}
