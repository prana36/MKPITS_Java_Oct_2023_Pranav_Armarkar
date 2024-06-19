package com.example.demo.controller;

import com.example.demo.dto.UserDemoDto;
import com.example.demo.service.impl.UserDemoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserDemoService userDemoServiceConstructor = new UserDemoService();
    public UserController(UserDemoService userDemoServiceConstructor) {
        this.userDemoServiceConstructor = userDemoServiceConstructor;
    }

    UserDemoService userDemoServiceSetter = new UserDemoService();

    public void setUserServiceSetter(UserDemoService userDemoServiceSetter) {
        this.userDemoServiceSetter = userDemoServiceSetter;
    }

    @RequestMapping("/v1/user/constructor")
    public ResponseEntity<Object> getUserFromConstructor(){
        UserDemoDto userDemoDtoByConstructor = userDemoServiceConstructor.getAllUsers();

        System.out.println("Constructor EMP Service: "+ userDemoServiceConstructor.hashCode());

        return ResponseEntity.ok(userDemoDtoByConstructor);
    }
    @RequestMapping("/v1/user/setter")
    public ResponseEntity<Object> getUserFromSetter(){

        UserDemoDto userDemoDtoBySetter = userDemoServiceSetter.getAllUsers();
        System.out.println("Setter EMP Service: "+ userDemoServiceSetter.hashCode());
        return ResponseEntity.ok(userDemoDtoBySetter);
    }
}
