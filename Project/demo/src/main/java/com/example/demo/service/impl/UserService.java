package com.example.demo.service.impl;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserResponseDto;
import com.example.demo.mysql.model.UserCredential;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserCredentailsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService implements IUserServices
{

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserCredentailsRepository userCredentialRepository;

    @Override
    public UserRequestDto getUserById(Integer id) {

        Optional<UserModel> userDbModel = userRepository.findById(id);
        UserRequestDto userRequestDto = new UserRequestDto();
        if (userDbModel.isPresent()){
            userRequestDto = convertUserModelToUserDto(userDbModel.get());
        }

        return userRequestDto;
    }



    @Override
    public List<UserRequestDto> getAllUsers() {
        List<UserModel> userModelList = (List<UserModel>) userRepository.findAll();
        List<UserRequestDto> userRequestDtoList = new ArrayList<>();
        for(UserModel userModel: userModelList){
            UserRequestDto userRequestDto = convertUserModelToUserDto(userModel);
            userRequestDtoList.add(userRequestDto);
        }
        return userRequestDtoList;
    }

    @Override
    @Transactional
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        UserModel userModel = new UserModel();
        userModel = convertUserDtoToUserModel(userRequestDto, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userRepository.save(userModel);


        // Below code saves data in user_credentials table
        UserCredential userCredential = new UserCredential();
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
        final String computedPassword = Hashing.sha256()
                .hashString(userRequestDto.getPassword(), StandardCharsets.UTF_8).toString() + uuid;
        userCredential.setUserId(userModel.getId());
        userCredential.setUserName(userRequestDto.getUserName());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setLoginDateTime(LocalDateTime.now());
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentialRepository.save(userCredential);

        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(userModel.getId());
        userResponseDto.setUserName(userCredential.getUserName());
        userResponseDto.setFirstName(userModel.getFirstName());
        userResponseDto.setMiddleName(userModel.getMiddleName());
        userResponseDto.setLastName(userModel.getLastName());

        return userResponseDto ;
    }


    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<UserModel> optionalUserDbModel = userRepository.findById(userRequestDto.getId());
        if (optionalUserDbModel.isEmpty()){
            System.out.println("User data with id: "+ userRequestDto.getId() +"not found");

        }else {
            UserModel userModel = convertUserDtoToUserModel(userRequestDto, optionalUserDbModel.get());
            userModel.setId(userRequestDto.getId());
            userModel =userRepository.save(userModel);
            return convertUserModelToUserDto(userModel);
        }
        return userRequestDto;
    }


    @Override
    public UserRequestDto updatePartialUser(UserRequestDto userRequestDto) {
        Optional<UserModel> optionalUserModel = userRepository.findById(userRequestDto.getId());
        if (optionalUserModel.isEmpty()){
            System.out.println("User data with id: "+ userRequestDto.getId() +"not found");

        }else {

            // Assigning  the data of optionalUserModel
            UserModel userModel = optionalUserModel.get();

            //  edit particular attributes
            userModel.setFirstName(userRequestDto.getFirstName() != null && !userRequestDto.getFirstName().equals(userModel.getFirstName())? userRequestDto.getFirstName(): userModel.getFirstName());
            userModel.setMiddleName(userRequestDto.getMiddleName() != null && !userRequestDto.getMiddleName().equals(userModel.getMiddleName())? userRequestDto.getMiddleName(): userModel.getMiddleName());
            userModel.setLastName(userRequestDto.getLastName() != null && !userRequestDto.getLastName().equals(userModel.getLastName())? userRequestDto.getLastName(): userModel.getLastName());
            userModel.setMobile(userRequestDto.getMobile() != null && !userRequestDto.getMobile().equals(userModel.getMobile())? userRequestDto.getMobile(): userModel.getMobile());
            userModel.setEmail(userRequestDto.getEmail() != null && !userRequestDto.getEmail().equals(userModel.getEmail())? userRequestDto.getEmail(): userModel.getEmail());
            userModel.setDateOfBirth(userRequestDto.getDateOfBirth() != null && !userRequestDto.getDateOfBirth().equals(userModel.getDateOfBirth())? userRequestDto.getDateOfBirth(): userModel.getDateOfBirth());
            userModel.setGender(userRequestDto.getGender() != null && !userRequestDto.getGender().equals(userModel.getGender())? userRequestDto.getGender(): userModel.getGender());
            userModel.setAdhaarNo(userRequestDto.getAdhaarNo() != null && !userRequestDto.getAdhaarNo().equals(userModel.getAdhaarNo())? userRequestDto.getAdhaarNo(): userModel.getAdhaarNo());

            userModel.setUpdatedBy(2);
            userModel.setUpdatedAt(LocalDateTime.now());
            userRepository.save(userModel);

            return convertUserModelToUserDto(userModel);
        }
        return userRequestDto;
    }

    @Override
    public UserRequestDto deleteUser(Integer id) {

        //Assign id which Fetch by user to userModelOptional of type Optional<UserModel>
        Optional<UserModel> userModelOptional = userRepository.findById(id);

        // it check the data is present or not of particular id
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + id + " not found");
            return  null;
        } else {
            userRepository.deleteById(id);
            System.out.println("User data with id: " + id + " deleted successfully");
            return  convertUserModelToUserDto(userModelOptional.get());
        }
    }

    private UserModel convertUserDtoToUserModel(UserRequestDto userRequestDto, UserModel userModel) {
//        UserDbModel userDbModel =new UserDbModel();
//        userModel.setFirstName(userRequestDto.getFirstName());
//        userModel.setMiddleName(userRequestDto.getMiddleName());
//        userModel.setLastName(userRequestDto.getLastName());
//
//        userModel.setMobile(userRequestDto.getMobile());
//        userModel.setEmail(userRequestDto.getEmail());
//        userModel.setDateOfBirth(userRequestDto.getDateOfBirth());
//        userModel.setAdhaarNo(userRequestDto.getAdhaarNo());
//        userModel.setGender(userRequestDto.getGender());
//        userModel.setUpdatedBy(1);
//        userModel.setUpdatedAt(LocalDateTime.now());

        userModel = UserModel.builder()
                .firstName(userRequestDto.getFirstName())
                .middleName(userRequestDto.getMiddleName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .dateOfBirth(userRequestDto.getDateOfBirth())
                .adhaarNo(userRequestDto.getAdhaarNo())
                .gender(userRequestDto.getGender())
                .updatedBy(1)
                .updatedAt(LocalDateTime.now())
                .build();
        
        return userModel;
    }

    private UserRequestDto convertUserModelToUserDto(UserModel userModel) {
//        UserRequestDto userRequestDto =new UserRequestDto();

        UserRequestDto  userRequestDto = UserRequestDto.builder()

                .id(userModel.getId())
                .firstName(userModel.getFirstName())
                .middleName(userModel.getMiddleName())
                .lastName(userModel.getLastName())

                .mobile(userModel.getMobile())
                .email(userModel.getEmail())
                .dateOfBirth(userModel.getDateOfBirth())
                .adhaarNo(userModel.getAdhaarNo())
                .gender(userModel.getGender())
        .build();
//        userDto.setCreatedBy(userModel.getCreatedBy());
//        userDto.setCreatedAt(userModel.getCreatedAt());
//        userDto.setUpdatedBy(userModel.getUpdatedBy());
//        userDto.setUpdatedAt(userModel.getUpdatedAt());
        return userRequestDto;
    }



}
