package com.mkpits.bank.controller;


import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.request.TransferRequestDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.*;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class AccountController {
    @Autowired
    IAccountService iAccountService;

//    @Autowired
//    IUserService iUserService;

    @GetMapping("/api/v1/accounts/{accountId}")
    private ResponseEntity<Object> getAccount(@PathVariable("accountId") Integer accountId) {
        AccountGetResponseDto accountGetResponseDto = iAccountService.getAccount(accountId);
        return ResponseEntity.ok(accountGetResponseDto);
    }

    @PostMapping("/api/v1/accounts")
    public ResponseEntity<Object> addAccount(@Valid @RequestBody AccountsRequestDto accountsRequestDto){

        AccountPostResponseDto accountPostResponseDto = iAccountService.addAccounts(accountsRequestDto);

        return ResponseEntity.created(URI.create("/api/v1/accounts"+accountPostResponseDto.getAccountId())).body(accountPostResponseDto);
    }

    @PutMapping("/api/v1/accounts/{accountId}")
    public ResponseEntity<Object> updateUser(@PathVariable("accountId") Integer accountId, @RequestBody AccountsRequestDto accountsRequestDto) {
        accountsRequestDto.setAccountId(accountId);
        AccountUpdateResponseDto accountUpdateResponseDto = iAccountService.updateAccount(accountsRequestDto);
        return ResponseEntity.ok(accountUpdateResponseDto);
    }

    @DeleteMapping("/api/v1/accounts/{accountId}")
    public ResponseEntity<Object> deleteUser(@PathVariable("accountId") Integer accountId) {

        AccountsRequestDto accountsRequestDto = iAccountService.deleteUser(accountId);
        if (accountsRequestDto != null) {
            return new ResponseEntity<>("User with ID " + accountId + " deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with ID " + accountId + " not found", HttpStatus.NOT_FOUND);
        }
    }


    //post account amount transfer from one user id to another
    @PostMapping(path = "/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> transferAmount(@Valid @PathVariable("userId") Integer userId, @RequestBody TransferRequestDto transferRequest) {
        MoneyTransferResponseDto transferResponse = iAccountService.amountTransfer(transferRequest, userId);
        return ResponseEntity.created(URI.create("/v1/accounts/users/" + transferResponse.getSenderId())).body(transferResponse);
    }
}
