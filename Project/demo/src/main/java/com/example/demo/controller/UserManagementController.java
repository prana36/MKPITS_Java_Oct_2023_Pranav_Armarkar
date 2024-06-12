package com.example.demo.controller;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.dto.response.UserGetResponseDto;
import com.example.demo.dto.response.UserPostResponseDto;
import com.example.demo.service.IUserServices;
import com.example.demo.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
public class UserManagementController {

    @Autowired // it allows Spring to automatically wire the required beans (dependencies) into your classes, eliminating the need for manual configuration
    IUserServices iUserServices;

    @Autowired
    UserValidator userValidator;

//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET)//The @RequestMapping annotation can be applied to class-level and/or method-level in a controller. The class-level annotation maps a specific request path or pattern onto a controller
    @GetMapping("/v1/users/{id}")
    private ResponseEntity<Object> getUser(@PathVariable("id") Integer id){
        // Assign the functionality of IUserServices to Decleared Variable Of type UserManagementDto
        UserGetResponseDto userGetResponseDto =iUserServices.getUserById(id);
        System.out.println("Autowired EMP Service: "+iUserServices.hashCode());

        return ResponseEntity.ok(userGetResponseDto); // Returning the  of usermanagementDto The Response Entity
    }

//    @RequestMapping(value = "/v1/users", method = RequestMethod.GET)
    @GetMapping(value = "/v1/users" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUsers() {
        List<UserGetResponseDto> userGetResponseDtoList = iUserServices.getAllUsers();
        return ResponseEntity.ok(userGetResponseDtoList);
    }


    //    @RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    @PostMapping("/v1/users")
    private ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto){
        boolean isValidAge = userValidator.validateAge(userRequestDto.getDateOfBirth());
        if(!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be greated than 18 yrs")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
        UserPostResponseDto userPostResponseDto = iUserServices.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/v1/users"+ userPostResponseDto.getId())).body(userPostResponseDto);
    }

//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PUT)
    @PutMapping("/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userRequestDtoReturn = iUserServices.updateUser(userRequestDto);
        return ResponseEntity.ok(userRequestDtoReturn);
    }

//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.PATCH)
    @PatchMapping("/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserRequestDto userRequestDtoReturn = iUserServices.updatePartialUser(userRequestDto);
        return ResponseEntity.ok(userRequestDtoReturn);
    }

//    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserRequestDto userRequestDtoSql = iUserServices.deleteUser(id);
        if (userRequestDtoSql != null) {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);
        } else  {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }

}
