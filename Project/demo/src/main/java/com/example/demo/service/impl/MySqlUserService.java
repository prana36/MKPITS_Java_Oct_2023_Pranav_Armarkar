package com.example.demo.service.impl;

import com.example.demo.dto.UserManagementDto;
import com.example.demo.mysql.model.UserDbModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class MySqlUserService implements IUserServices
{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserManagementDto getUsers(Integer id) {

        Optional<UserDbModel> userDbModel = userRepository.findById(id);
        UserManagementDto userManagementDto = new UserManagementDto();
        if (userDbModel.isPresent()){
            userManagementDto = convertUserDbModelToUserManagementDto(userDbModel.get());
        }

        return userManagementDto;
    }

    @Override
    public UserManagementDto createUser(UserManagementDto userManagementDto) {
       UserDbModel userDbModel = convertUserDtoToUserModel(userManagementDto);
        userDbModel = userRepository.save(userDbModel);
        return convertUserDbModelToUserManagementDto(userDbModel);
    }

    private UserDbModel convertUserDtoToUserModel(UserManagementDto userManagementDto) {
        UserDbModel userDbModel =new UserDbModel();
        userDbModel.setFirstName(userManagementDto.getFirstName());
        userDbModel.setMiddleName(userManagementDto.getMiddleName());
        userDbModel.setLastName(userManagementDto.getLastName());
        userDbModel.setMobile(userManagementDto.getMobile());
        userDbModel.setEmail(userManagementDto.getEmail());
        userDbModel.setDateOfBirth(userManagementDto.getDateOfBirth());
        userDbModel.setAdhaarNo(userManagementDto.getAdhaarNo());
        userDbModel.setGender(userManagementDto.getGender());
        userDbModel.setCreatedBy(1);
        userDbModel.setCreatedAt(LocalDateTime.now());
        userDbModel.setUpdatedBy(1);
        userDbModel.setUpdatedAt(LocalDateTime.now());
        
        return userDbModel;
    }

    private UserManagementDto convertUserDbModelToUserManagementDto(UserDbModel userDbModel) {
        UserManagementDto userManagementDto =new UserManagementDto();
        userManagementDto.setId(userDbModel.getId());
        userManagementDto.setFirstName(userDbModel.getFirstName());
        userManagementDto.setMiddleName(userDbModel.getMiddleName());
        userManagementDto.setLastName(userDbModel.getLastName());
        userManagementDto.setMobile(userDbModel.getMobile());
        userManagementDto.setEmail(userDbModel.getEmail());
        userManagementDto.setDateOfBirth(userDbModel.getDateOfBirth());
        userManagementDto.setAdhaarNo(userDbModel.getAdhaarNo());
        userManagementDto.setGender(userDbModel.getGender());

        return userManagementDto;
    }


}
