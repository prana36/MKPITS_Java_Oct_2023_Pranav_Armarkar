package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;

import java.util.List;

public interface IUserService {
    List<UserResponseDto> getAllUsers();

    public UserResponseDto getUserByUserId(Integer id);

    UserResponseDto createUser(UserRequestDto userRequestDto);
}
