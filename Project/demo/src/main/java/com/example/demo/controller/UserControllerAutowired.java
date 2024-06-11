package com.example.demo.controller;

import com.example.demo.dto.UserDemoDto;
import com.example.demo.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerAutowired {

    @Autowired
    IUserService userServiceAutowired;

    @RequestMapping("/v1/user/autowired")
    public ResponseEntity<Object> getUserFromAutowired(){
        UserDemoDto userDemoDtoByAutowired = userServiceAutowired.getAllUsers();

        System.out.println("Autowired EMP Service: "+userServiceAutowired.hashCode());

        return ResponseEntity.ok(userDemoDtoByAutowired);
    }

}
