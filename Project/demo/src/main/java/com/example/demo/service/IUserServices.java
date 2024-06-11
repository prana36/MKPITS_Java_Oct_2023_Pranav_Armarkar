package com.example.demo.service;


import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserResponseDto;

import java.util.List;

public interface IUserServices
{

 UserRequestDto getUserById(Integer id);
 UserResponseDto createUser(UserRequestDto userRequestDto);
 UserRequestDto updateUser(UserRequestDto userRequestDto);

 public List<UserRequestDto> getAllUsers();
 public UserRequestDto deleteUser(Integer id);
 UserRequestDto updatePartialUser(UserRequestDto userRequestDto);
}
