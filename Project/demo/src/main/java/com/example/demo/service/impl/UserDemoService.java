package com.example.demo.service.impl;

import com.example.demo.dto.UserDemoDto;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserDemoService implements IUserService
{
    @Override
    public UserDemoDto getAllUsers(){
        UserDemoDto userDemoDto = new UserDemoDto();
        userDemoDto.setId(27);
        userDemoDto.setName("Pranav Armarkar");
        userDemoDto.setAge(22);

        return userDemoDto;
    }
}
