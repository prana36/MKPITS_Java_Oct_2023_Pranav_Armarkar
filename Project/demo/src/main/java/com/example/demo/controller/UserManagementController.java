package com.example.demo.controller;

import com.example.demo.dto.UserManagementDto;
import com.example.demo.mysql.model.UserDbModel;
import com.example.demo.service.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserManagementController {

    @Autowired // it allows Spring to automatically wire the required beans (dependencies) into your classes, eliminating the need for manual configuration
    IUserServices iUserServices;

    @RequestMapping(value = "/v1/users/{id}", method = RequestMethod.GET) //The @RequestMapping annotation can be applied to class-level and/or method-level in a controller. The class-level annotation maps a specific request path or pattern onto a controller
    private ResponseEntity<Object> getUser(@PathVariable("id") Integer id){
        // Assign the functionality of IUserServices to Decleared Variable Of type UserManagementDto
        UserManagementDto userManagementDto =iUserServices.getUsers(id);
        System.out.println("Autowired EMP Service: "+iUserServices.hashCode());

        return ResponseEntity.ok(userManagementDto); // Returning the  of usermanagementDto The Response Entity
    }

    @RequestMapping(value = "/v1/users", method = RequestMethod.POST)
    private ResponseEntity<Object> createUser(@RequestBody UserManagementDto userManagementDto){
        UserManagementDto userMDtoReturn = iUserServices.createUser(userManagementDto);
        return ResponseEntity.ok(userMDtoReturn);
    }
}
