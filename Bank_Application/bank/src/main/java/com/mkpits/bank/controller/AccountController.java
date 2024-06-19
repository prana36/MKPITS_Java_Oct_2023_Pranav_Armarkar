package com.mkpits.bank.controller;


import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.AccountGetResponseDto;
import com.mkpits.bank.dto.response.AccountUpdateResponseDto;
import com.mkpits.bank.dto.response.UserUpdateResponseDto;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    IAccountService iAccountService;
            @GetMapping("/api/v1/accounts/{userId}")
           private ResponseEntity<Object> getAccount(@PathVariable ("userId")  Integer userId ) {
                AccountGetResponseDto accountGetResponseDto = iAccountService.getAccount(userId);
                return ResponseEntity.ok(accountGetResponseDto);
            }

    @PutMapping("/api/v1/accounts/{userId}")
    public ResponseEntity<Object> updateUser(@PathVariable("userId") Integer userId, @RequestBody AccountsRequestDto accountsRequestDto) {
        accountsRequestDto.setUserId(userId);
        AccountUpdateResponseDto accountUpdateResponseDto = iAccountService.updateAccount(accountsRequestDto);
        return ResponseEntity.ok(accountUpdateResponseDto);
    }

    @DeleteMapping("/api/v1/accounts/{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable("userId") Integer userId){

        AccountsRequestDto accountsRequestDto = iAccountService.deleteUser(userId);
        if (accountsRequestDto != null) {
            return new ResponseEntity<>("User with ID " + userId + " deleted successfully", HttpStatus.OK);
        } else  {
            return new ResponseEntity<>("User with ID " + userId + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
