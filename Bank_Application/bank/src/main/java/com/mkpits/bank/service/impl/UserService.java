package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.mysql.model.Account;
import com.mkpits.bank.mysql.model.Address;
import com.mkpits.bank.mysql.model.User;
import com.mkpits.bank.mysql.model.UserCredential;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.repository.AddressRepository;
import com.mkpits.bank.repository.UserCredentialRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserCredentialRepository userCredentialRepository;

    @Autowired
    AddressRepository addressRepository;


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
                .aadharNo(user.getAadharNo())
                .build();
        return getUserResponseDto;
    }

    @Override
    public UserResponseDto getUserByUserId(Integer id) {
        Optional<User> userModel = userRepository.findById(id);
        UserResponseDto userResponseDto = new UserResponseDto();
        if (userModel.isPresent()) {
            userResponseDto = convertUserModelToUserDto(userModel.get());
        }
        return userResponseDto;
    }


    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = convertUserRequestDtoToUser(userRequestDto);

//        String cinNo = String.valueOf(LocalDateTime.now());
//        user.setCin(cinNo.replaceAll("^0-9",""));

        String cinNo= String.valueOf(LocalDateTime.now());
        user.setCin(cinNo.replaceAll("[^0-9]", "").substring(0,cinNo.replaceAll("[^0-9]", "").length()-6));
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy(1);
        user = userRepository.save(user);

        // For
        Account account = new Account();
        account.setUserId(user.getId());
        account.setAccType(userRequestDto.getAccType());
        String cityCode = "456";String districtCode="852";String stateCode="624";String remaingAccountNumber = "0123";
        account.setAccNo(stateCode+cityCode+districtCode+remaingAccountNumber);
        account.setOpeningDate(LocalDate.now());
        account.setBalance(0.0);
        account = accountRepository.save(account);


        UserCredential userCredential = new UserCredential();
        userCredential.setUserId(user.getId());
//        userCredential.setUserName(userRequestDto.getUserName());
        userCredential.setPassword(userRequestDto.getPassword());
        userCredential=userCredentialRepository.save(userCredential);


        Address address = new Address();
        address.setUserId(user.getId());
        address.setAddress(userRequestDto.getAddress());
        address.setPinCode(userRequestDto.getPinCode());
        address = addressRepository.save(address);

        return convertUserToUserResponseDto(user , userCredential , account, address);

    }

    private UserResponseDto convertUserToUserResponseDto(User user , UserCredential userCredential , Account account,Address address) {
        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .gender(user.getGender())
                .mobile(user.getMobile())
                .email(user.getEmail())
                .dateOfBirth(user.getDateOfBirth())
                .aadharNo(user.getAadharNo())
                .cin(user.getCin())
                //
                .address(address.getAddress())
                .pinCode(address.getPinCode())
                .accType(account.getAccType())
                .build();
    }

    private User convertUserRequestDtoToUser(UserRequestDto userRequestDto) {
        return User.builder()
                .firstName(userRequestDto.getFirstName())
                .middleName(userRequestDto.getMiddleName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .gender(userRequestDto.getGender())
                .dateOfBirth(userRequestDto.getDateOfBirth())
                .aadharNo(userRequestDto.getAadharNo())
               .build();
}
}
