package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.AccountsRequestDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserGetResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserUpdateResponseDto;
import jakarta.transaction.Transactional;

import java.util.List;

public interface IUserService {
    UserRequestDto getUserById(Integer id);


    //     for list of accounts
//    List<AccountsRequestDto> getAllAccountByUserId(Integer id);

    List<UserRequestDto> getAllUsers();

    @Transactional
    UserPostResponseDto createUser(UserRequestDto userRequestDto);

    UserUpdateResponseDto updateUser(UserRequestDto userRequestDto);

    UserUpdateResponseDto UpdatePartialUser(UserRequestDto userRequestDto);

    UserRequestDto deleteUser(Integer id);
}
