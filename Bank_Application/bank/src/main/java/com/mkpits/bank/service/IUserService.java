package com.mkpits.bank.service;

import com.mkpits.bank.dto.UserResponseDto;

import java.util.List;

public interface IUserService {
    List<UserResponseDto> getAllUsers();

    public UserResponseDto getUserByIdUser(Integer id);
}
