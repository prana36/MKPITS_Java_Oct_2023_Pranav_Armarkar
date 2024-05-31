package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserService userServiceConstructor = new UserService();
    public UserController(UserService userServiceConstructor) {
        this.userServiceConstructor = userServiceConstructor;
    }

    UserService userServiceSetter = new UserService();

    public void setUserServiceSetter(UserService userServiceSetter) {
        this.userServiceSetter = userServiceSetter;
    }





    @RequestMapping("/v1/user/constructor")
    public ResponseEntity<Object> getUserFromConstructor(){
        UserDto userDtoByConstructor = userServiceConstructor.getAllUsers();

        System.out.println("Constructor EMP Service: "+userServiceConstructor.hashCode());

        return ResponseEntity.ok(userDtoByConstructor);
    }
    @RequestMapping("/v1/user/setter")
    public ResponseEntity<Object> getUserFromSetter(){

        UserDto userDtoBySetter = userServiceSetter.getAllUsers();
        System.out.println("Setter EMP Service: "+userServiceSetter.hashCode());
        return ResponseEntity.ok(userDtoBySetter);
    }
}
