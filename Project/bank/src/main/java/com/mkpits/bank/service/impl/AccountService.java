package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.request.TransferRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountPostResponseDto;
import com.mkpits.bank.dto.response.AccountUpdateResponseDto;
import com.mkpits.bank.dto.response.MoneyTransferResponseDto;
import com.mkpits.bank.exception.InsufficientBalanceException;
import com.mkpits.bank.mysql.model.AccountModel;
import com.mkpits.bank.mysql.model.UserModel;
import com.mkpits.bank.repository.AccountsRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountsRepository accountsRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public AccountGetResponseDto getAccount(Integer accountId) {
        Optional<AccountModel> accountModelOptional = accountsRepository.findById(accountId);
        AccountGetResponseDto accountGetResponseDto = new AccountGetResponseDto();
        if (accountModelOptional.isPresent()) {

            accountGetResponseDto = convertAccountModelToDto(accountModelOptional.get());
        }

        return accountGetResponseDto;
    }

    private AccountGetResponseDto convertAccountModelToDto(AccountModel accountModel) {
        AccountGetResponseDto accountGetResponseDto = AccountGetResponseDto.builder()
                .accountId(accountModel.getAccountId())
                .userId(accountModel.getUserId())
                .rateOfIntrest("11")
                .accountType(accountModel.getAccountType())
                .balance(accountModel.getBalance())
                .rateOfIntrest(accountModel.getRateOfIntrest())

                .build();
        return accountGetResponseDto;
    }

    @Override
    public AccountPostResponseDto addAccounts(AccountsRequestDto accountsRequestDto){
        AccountModel accountModel = new AccountModel();
        accountModel= convertAccountRequestDtoToAccountModel(accountsRequestDto, accountModel);
        accountModel = accountsRepository.save(accountModel);

        AccountPostResponseDto accountPostResponseDto = AccountPostResponseDto.builder()
                .userId(accountModel.getUserId())
                .accountType(accountModel.getAccountType())
                .balance(accountModel.getBalance())
                .build();

        return accountPostResponseDto;
    }

    @Override
    public AccountUpdateResponseDto updateAccount(AccountsRequestDto accountsRequestDto) {
        Optional<AccountModel> accountModelOptional = accountsRepository.findById(accountsRequestDto.getAccountId());

        if (accountModelOptional.isEmpty()) {
            System.out.println("User data with id: " + accountsRequestDto.getAccountId() + " not found");

        } else {
            AccountModel accountModel = convertAccountRequestDtoToAccountModel(accountsRequestDto, accountModelOptional.get());
            accountModel.setAccountId(accountsRequestDto.getAccountId());
//            accountModel.setUpdatedBy(2);
//            accountModel.setUpdatedAt(LocalDateTime.now());
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
                .accountId(accountsRequestDto.getAccountId())
                .accountType(accountsRequestDto.getAccountType())
                .rateOfIntrest(accountsRequestDto.getRateOfIntrest())
                .balance(accountsRequestDto.getBalance())
                .updatedAt(LocalDateTime.now())
                .updatedBy(2)
                .build();
        return accountModel;
    }

    @Override
    public AccountsRequestDto deleteUser(Integer accountId) {
        Optional<AccountModel> accountModelOptional = accountsRepository.findById(accountId);

        if (accountModelOptional.isEmpty()) {
            System.out.println("User data with id: " + accountId + " not found");

            return null;
        } else {
            accountsRepository.deleteById(accountId);
            System.out.println("User data with id: " + accountId + " deleted successfully");
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

    @Override
    public MoneyTransferResponseDto amountTransfer(TransferRequestDto transferRequest, Integer senderUserId) {
        // Retrieve sender and receiver user information
        Optional<UserModel> senderUserOpt = userRepository.findById(senderUserId);
        Optional<AccountModel> senderAccountOpt = accountsRepository.findByUserId(senderUserId);
        Optional<AccountModel> receiverAccountOpt = accountsRepository.findByUserId(transferRequest.getReceiverUserId());

        if (senderUserOpt.isEmpty() || senderAccountOpt.isEmpty() || receiverAccountOpt.isEmpty()) {
            throw new RuntimeException("One or both id not found");
        }

        AccountModel senderAccount = senderAccountOpt.get();
        AccountModel receiverAccount = receiverAccountOpt.get();

        // Check if the sender has sufficient balance
        if (senderAccount.getBalance() < transferRequest.getAmount()) {
            throw new InsufficientBalanceException("Sender has insufficient balance");
        }

        // Perform the balance transfer
        senderAccount.setBalance(senderAccount.getBalance() - transferRequest.getAmount());
        receiverAccount.setBalance(receiverAccount.getBalance() + transferRequest.getAmount());

        // Save the updated account balances
        accountsRepository.save(senderAccount);
        accountsRepository.save(receiverAccount);

        // Create the transfer response
        MoneyTransferResponseDto transferResponse = new MoneyTransferResponseDto();
        transferResponse.setSenderId(senderAccount.getAccountId());
        transferResponse.setReceiverId(receiverAccount.getAccountId());
        transferResponse.setTransferredAmount(transferRequest.getAmount());
        transferResponse.setSenderBalance(senderAccount.getBalance());
        transferResponse.setReceiverBalance(receiverAccount.getBalance());

        return transferResponse;
    }

}
