package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserGetResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserUpdateResponseDto;
import com.mkpits.bank.mysql.model.AccountModel;
import com.mkpits.bank.mysql.model.UserModel;
import com.mkpits.bank.repository.AccountsRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountsRepository accountsRepository;

    @Override
    public UserRequestDto getUserById(Integer id) {
        Optional<UserModel> userModel = userRepository.findById(id);
        UserRequestDto userRequestDto = new UserRequestDto();

        if (userModel.isPresent()) {
            userRequestDto = converUserModelToUserRequestDto(userModel.get());
        }
        return userRequestDto;
    }





    @Override
    public List<UserRequestDto> getAllUsers() {

        List<UserModel> userModelList = (List<UserModel>) userRepository.findAll();
        List<UserRequestDto> userRequestDtos = new ArrayList<>();

        for (UserModel userModel : userModelList) {
            UserRequestDto userRequestDto = converUserModelToUserRequestDto(userModel);
            userRequestDtos.add(userRequestDto);
        }
        return userRequestDtos;
    }

    // this method is use When (GET) Response Data get
    private UserGetResponseDto converUserModelToUserGetResponse(UserModel userModel) {

        UserGetResponseDto userGetResponseDto = UserGetResponseDto.builder()
                .id(userModel.getId())
                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .gender(userModel.getGender())
                .email(userModel.getEmail())
                .mobileNo(userModel.getMobileNo())
                .dateOfBirth(userModel.getDateOfBirth())
                .build();
        return userGetResponseDto;
    }

    @Override
    @Transactional
    public UserPostResponseDto createUser(UserRequestDto userRequestDto) {
        UserModel userModel = new UserModel();
        userModel = converUserRequestDtoToUserModel(userRequestDto, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userRepository.save(userModel);

        // Below code saves data in accounts table
//        AccountsRequestDto accountsRequestDto = new AccountsRequestDto();
        AccountModel accountModel = AccountModel.builder()
                .accountId(userModel.getId())
                .rateOfIntrest("10")
                .balance(userRequestDto.getBalance())
                .accountType(userRequestDto.getAccountType())
                .updatedBy(1)
                .updatedAt(LocalDateTime.now())
                .build();

        accountsRepository.save(accountModel);

        UserPostResponseDto userPostResponseDto = UserPostResponseDto.builder()
                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .email(userModel.getEmail())
                .build();

        return userPostResponseDto;
    }

    // this method is use When (POST) Data create
    private UserModel converUserRequestDtoToUserModel(UserRequestDto userRequestDto, UserModel userModel) {
        userModel = UserModel.builder()
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .gender(userRequestDto.getGender())
                .email(userRequestDto.getEmail())
                .mobileNo(userRequestDto.getMobileNo())
                .dateOfBirth(userRequestDto.getDateOfBirth())
                .address(userRequestDto.getAddress())
                .city(userRequestDto.getCity())
                .state(userRequestDto.getState())
                .zipCode(userRequestDto.getZipCode())
                .updatedBy(1)
                .updatedAt(LocalDateTime.now())
                .build();
        return userModel;
    }

    @Override
    public UserUpdateResponseDto updateUser(UserRequestDto userRequestDto) {

        Optional<UserModel> userModelOptional = userRepository.findById(userRequestDto.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            UserModel userModel = converUserRequestDtoToUserModel(userRequestDto, userModelOptional.get());
            userModel.setId(userRequestDto.getId());
            userModel.setUpdatedBy(2);
            userModel.setUpdatedAt(LocalDateTime.now());
            userModel = userRepository.save(userModel);
            return converUserModelToUserUpdateResponse(userModel);
        }
        UserUpdateResponseDto UserUpdateResponseDto = new UserUpdateResponseDto();
        return UserUpdateResponseDto;
    }

    private UserUpdateResponseDto converUserModelToUserUpdateResponse(UserModel userModel) {
        UserUpdateResponseDto userUpdateResponseDto = UserUpdateResponseDto.builder()

                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .gender(userModel.getGender())
                .email(userModel.getEmail())
                .mobileNo(userModel.getMobileNo())
                .dateOfBirth(userModel.getDateOfBirth())
                .address(userModel.getAddress())
                .city(userModel.getCity())
                .state(userModel.getState())
                .zipCode(userModel.getZipCode())
                .build();
        return userUpdateResponseDto;
    }

    @Override
    public UserUpdateResponseDto UpdatePartialUser(UserRequestDto userRequestDto) {
        Optional<UserModel> userModelOptional = userRepository.findById(userRequestDto.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userRequestDto.getFirstName() != null && !userRequestDto.getFirstName()
                    .equals(userModel.getFirstName()) ? userRequestDto.getFirstName() : userModel.getFirstName());
            userModel.setLastName(userRequestDto.getLastName() != null && !userRequestDto.getLastName()
                    .equals(userModel.getLastName()) ? userRequestDto.getLastName() : userModel.getLastName());
            userModel.setGender(userRequestDto.getGender() != null && !userRequestDto.getGender().equals(userModel.getGender()) ? userRequestDto.getGender() : userModel.getGender());
            userModel.setEmail(userRequestDto.getEmail() != null && !userRequestDto.getEmail()
                    .equals(userModel.getEmail()) ? userRequestDto.getEmail() : userModel.getEmail());
            userModel.setMobileNo(userRequestDto.getMobileNo() != null && !userRequestDto.getMobileNo()
                    .equals(userModel.getMobileNo()) ? userRequestDto.getMobileNo() : userModel.getMobileNo());
            userModel.setDateOfBirth(userRequestDto.getDateOfBirth() != null && !userRequestDto.getDateOfBirth()
                    .equals(userModel.getEmail()) ? userRequestDto.getDateOfBirth() : userModel.getDateOfBirth());
            userModel.setAddress(userRequestDto.getAddress() != null && !userRequestDto.getAddress()
                    .equals(userModel.getAddress()) ? userRequestDto.getAddress() : userModel.getAddress());
            userModel.setCity(userRequestDto.getCity() != null && !userRequestDto.getCity()
                    .equals(userModel.getCity()) ? userRequestDto.getCity() : userModel.getCity());
            userModel.setState(userRequestDto.getState() != null && !userRequestDto.getState()
                    .equals(userModel.getState()) ? userRequestDto.getState() : userModel.getState());
            userModel.setZipCode(userRequestDto.getZipCode() != null && !userRequestDto.getZipCode()
                    .equals(userModel.getZipCode()) ? userRequestDto.getZipCode() : userModel.getZipCode());

            userModel.setUpdatedBy(2);
            userModel.setUpdatedAt(LocalDateTime.now());
            userRepository.save(userModel);
            return converUserModelToUserUpdateResponse(userModel);
        }
//        UserUpdateResponseDto userUpdateResponseDto = UserUpdateResponseDto.builder().build();
        return UserUpdateResponseDto.builder().build();
    }

    @Override
    public UserRequestDto deleteUser(Integer id) {
        Optional<UserModel> userModelOptional = userRepository.findById(id);

        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + id + " not found");

            return null;
        } else {
            userRepository.deleteById(id);
            System.out.println("User data with id: " + id + " deleted successfully");
           return converUserModelToUserRequestDto(userModelOptional.get());
        }

    }

    private UserRequestDto converUserModelToUserRequestDto(UserModel userModel) {

        UserRequestDto userRequestDto = UserRequestDto.builder()
                .id(userModel.getId())
                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .gender(userModel.getGender())
                .email(userModel.getEmail())
                .mobileNo(userModel.getMobileNo())
                .dateOfBirth(userModel.getDateOfBirth())
                .address(userModel.getAddress())
                .city(userModel.getCity())
                .state(userModel.getState())
                .zipCode(userModel.getZipCode())
                .build();
        return userRequestDto;
    }

    
}
//waste
//     for list of accounts
//    @Override
//    public List<AccountsRequestDto> getAllAccountByUserId(Integer id){
//
////        Optional<AccountModel> accountModelOptional = accountsRepository.findAllById(id);
//
//        List<AccountModel> accountModelList = (List<AccountModel>) accountsRepository.findAll();
//        List<AccountsRequestDto> accountsRequestDtos = new ArrayList<>();
//
//        for (AccountModel AccountModel : accountModelList) {
//            AccountsRequestDto accountsRequestDto = converAccountModelToAccountRequestDto(AccountModel);
//            accountsRequestDtos.add(accountsRequestDto);
//        }
//        return accountsRequestDtos;
//
//    }

//    private AccountsRequestDto converAccountModelToAccountRequestDto(AccountModel accountModel) {
//        return AccountsRequestDto.builder()
//                .accountId(accountModel.getAccountId())
//                .userId(accountModel.getUserId())
//                .rateOfIntrest(accountModel.getRateOfIntrest())
//                .balance(accountModel.getBalance())
//                .accountType(accountModel.getAccountType())
//                .build();
//    }