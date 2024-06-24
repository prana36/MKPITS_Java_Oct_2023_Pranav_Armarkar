package com.mkpits.bank.controller;


import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.ErrorResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserUpdateResponseDto;
import com.mkpits.bank.mysql.model.UserModel;
import com.mkpits.bank.service.IUserService;
import com.mkpits.bank.service.impl.UserService;
import com.mkpits.bank.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserService iuserService;

    @Autowired
    UserValidator userValidator;

    @GetMapping("/api/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {


        UserRequestDto userRequestDto = iuserService.getUserById(id);

        boolean isValidId = userValidator.validateId(userRequestDto.getId());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userRequestDto);
    }

    @GetMapping(value = "/api/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserRequestDto> userRequestDtoList = iuserService.getAllUsers();
        return ResponseEntity.ok(userRequestDtoList);
    }

    @PostMapping("/api/v1/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {

        boolean isValidAge = userValidator.validateAge(userRequestDto.getDateOfBirth());
        if (!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be greated than 18 yrs")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
        UserPostResponseDto userPostResponseDto = iuserService.createUser(userRequestDto);

        return ResponseEntity.created(URI.create("/api/v1/users" + userPostResponseDto.getId())).body(userPostResponseDto);
    }

    @PutMapping("/api/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("userId") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserUpdateResponseDto userRequestDtoReturn = iuserService.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDtoReturn);
    }

    @PatchMapping("/api/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserUpdateResponseDto userRequestDtoReturn = iuserService.UpdatePartialUser(userRequestDto);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userRequestDtoReturn);
    }

    @DeleteMapping("/api/v1/users/{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {

        UserRequestDto userRequestDto = iuserService.deleteUser(id);
        if (userRequestDto != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }


}
