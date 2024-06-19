package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountUpdateResponseDto;
import com.mkpits.bank.mysql.model.AccountModel;
import com.mkpits.bank.repository.AccountsRepository;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountsRepository accountsRepository;

    @Override
    public AccountGetResponseDto getAccount(Integer userId) {
        Optional<AccountModel> accountModelOptional = accountsRepository.findById(userId);
        AccountGetResponseDto accountGetResponseDto = new AccountGetResponseDto();
        if (accountModelOptional.isPresent()) {

            accountGetResponseDto = convertAccountModelToDto(accountModelOptional.get());
        }

        return accountGetResponseDto;
    }

    private AccountGetResponseDto convertAccountModelToDto(AccountModel accountModel) {
        AccountGetResponseDto accountGetResponseDto = AccountGetResponseDto.builder()
                .rateOfIntrest("11")
                .accountType(accountModel.getAccountType())
                .balance(accountModel.getBalance())
                .rateOfIntrest(accountModel.getRateOfIntrest())
                .build();
        return accountGetResponseDto;
    }

    @Override
    public AccountUpdateResponseDto updateAccount(AccountsRequestDto accountsRequestDto) {
        Optional<AccountModel> accountModelOptional = accountsRepository.findById(accountsRequestDto.getUserId());

        if (accountModelOptional.isEmpty()) {
            System.out.println("User data with id: " + accountsRequestDto.getUserId() + " not found");

        } else {
            AccountModel accountModel = convertAccountRequestDtoToAccountModel(accountsRequestDto, accountModelOptional.get());
            accountModel.setUserId(accountsRequestDto.getUserId());
            accountModel.setUpdatedBy(2);
            accountModel.setUpdatedAt(LocalDateTime.now());
            accountModel = accountsRepository.save(accountModel);
//         return accountModel;
            return convertAccountModelToResponseUpdate(accountModel);
        }
        AccountUpdateResponseDto accountUpdateResponseDto = new AccountUpdateResponseDto();

        return accountUpdateResponseDto;
//        return accountsRequestDto;
    }

//     response for update
    private AccountUpdateResponseDto convertAccountModelToResponseUpdate(AccountModel accountModel){

        AccountUpdateResponseDto accountUpdateResponseDto= AccountUpdateResponseDto.builder()
                .accountType(accountModel.getAccountType())
                .balance(accountModel.getBalance())
                .build();

        return accountUpdateResponseDto;
    }

    private AccountModel convertAccountRequestDtoToAccountModel(AccountsRequestDto accountsRequestDto, AccountModel accountModel) {
        accountModel = AccountModel.builder()
//                .id(accountsRequestDto.getId())
                .accountType(accountsRequestDto.getAccountType())

                .rateOfIntrest(accountsRequestDto.getRateOfIntrest())
                .balance(accountsRequestDto.getBalance())
                .build();
        return accountModel;
    }

    @Override
    public AccountsRequestDto deleteUser(Integer userId) {
        Optional<AccountModel> accountModelOptional = accountsRepository.findById(userId);

        if (accountModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userId + " not found");

            return null;
        } else {
            accountsRepository.deleteById(userId);
            System.out.println("User data with id: " + userId + " deleted successfully");
            return converAccountModelToAccountRequestDto(accountModelOptional.get());
        }


    }

    private AccountsRequestDto converAccountModelToAccountRequestDto(AccountModel accountModel) {
        AccountsRequestDto accountsRequestDto =AccountsRequestDto.builder()
                .userId(accountModel.getUserId())
                .rateOfIntrest(accountModel.getRateOfIntrest())
                .balance(accountModel.getBalance())
                .accountType(accountModel.getAccountType())
                .build();
        return accountsRequestDto;
    }


}
