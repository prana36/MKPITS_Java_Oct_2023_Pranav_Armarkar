package com.example.demo.service;


import com.example.demo.dto.UserManagementDto;

public interface IUserServices
{

 UserManagementDto getUsers(Integer id);
 public UserManagementDto createUser(UserManagementDto userManagementDto);
}
