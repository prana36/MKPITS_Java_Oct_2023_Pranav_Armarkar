package com.example.demo.service;


import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.dto.response.UserUpdateResponseDto;

import java.util.List;

public interface IUserServices
{

 UserRequestDto getUserById(Integer id);
 UserPostResponseDto createUser(UserRequestDto userRequestDto);
 UserUpdateResponseDto updateUser(UserRequestDto userRequestDto);

 public List<UserGetResponseDto> getAllUsers();
 public UserRequestDto deleteUser(Integer id);
 UserUpdateResponseDto updatePartialUser(UserRequestDto userRequestDto);
}
