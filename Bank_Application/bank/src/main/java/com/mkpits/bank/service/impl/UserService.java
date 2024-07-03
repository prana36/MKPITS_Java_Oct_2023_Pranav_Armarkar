package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.UserResponseDto;
import com.mkpits.bank.mysql.model.User;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> usersList = (List<User>) userRepository.findAll();
        List<UserResponseDto> userResponseDtoArrayList = new ArrayList<>();
        for (User user : usersList) {
            UserResponseDto getUserResponseDto = convertUserModelToUserDto(user);
            userResponseDtoArrayList.add(getUserResponseDto);
        }
        return userResponseDtoArrayList;
    }


    private UserResponseDto convertUserModelToUserDto(User user) {
        UserResponseDto getUserResponseDto = UserResponseDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .gender(user.getGender())
                .cin(user.getCin())
                .aadharNo(user.getAadharCard())
                .build();
        return getUserResponseDto;
    }

    @Override
    public UserResponseDto getUserByIdUser(Integer id) {
        Optional<User> userModel = userRepository.findById(id);
        UserResponseDto userResponseDto = new UserResponseDto();
        if (userModel.isPresent()) {
            userResponseDto = convertUserModelToUserDto(userModel.get());
        }
        return userResponseDto;
    }
}
