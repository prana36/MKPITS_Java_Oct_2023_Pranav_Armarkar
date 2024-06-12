package com.example.demo.service;


import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;

import java.util.List;

public interface IUserServices
{

 UserGetResponseDto getUserById(Integer id);
 UserPostResponseDto createUser(UserRequestDto userRequestDto);
 UserRequestDto updateUser(UserRequestDto userRequestDto);

 public List<UserGetResponseDto> getAllUsers();
 public UserRequestDto deleteUser(Integer id);
 UserRequestDto updatePartialUser(UserRequestDto userRequestDto);
}
