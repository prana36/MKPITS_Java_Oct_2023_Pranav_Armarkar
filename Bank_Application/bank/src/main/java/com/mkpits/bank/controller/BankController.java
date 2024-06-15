package com.mkpits.bank.controller;


import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.response.UserGetResponseDto;
import com.mkpits.bank.dto.response.UserPostResponseDto;
import com.mkpits.bank.dto.response.UserUpdateResponseDto;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class BankController {
    @Autowired
    IUserService iuserService;

    @GetMapping("/v1/user/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id){

        UserGetResponseDto userGetResponseDto = iuserService.getUserById(id);

        return ResponseEntity.ok(userGetResponseDto) ;
    }

    @GetMapping(value = "/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Object> getAllUsers(){
        List<UserGetResponseDto> userGetResponseDtoList = iuserService.getAllUsers();
        return ResponseEntity.ok(userGetResponseDtoList);
    }

    @PostMapping("/v1/user")
    public ResponseEntity<Object> createUser(@RequestBody UserRequestDto userRequestDto){
        UserPostResponseDto userPostResponseDto =iuserService.createUser(userRequestDto);

        return ResponseEntity.created(URI.create("/v1/user"+ userPostResponseDto.getId())).body(userPostResponseDto);
    }

    @PutMapping("/v1/user/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserUpdateResponseDto userRequestDtoReturn = iuserService.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDtoReturn);
    }
    @PatchMapping("/v1/user/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserUpdateResponseDto userRequestDtoReturn = iuserService.UpdatePartialUser(userRequestDto);
        return ResponseEntity.ok(userRequestDtoReturn);
    }

    @DeleteMapping("/v1/user/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id){

        UserRequestDto userRequestDtoSql = iuserService.deleteUser(id);
        if (userRequestDtoSql != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else  {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
