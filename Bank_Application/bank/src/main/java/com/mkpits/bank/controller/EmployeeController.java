package com.mkpits.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee/dashboard")
    public  String employeeDashboard(){
        return "/employee/index";
    }

    @GetMapping("/employee/dashboard/usermanagement")
    public  String employeeUserManagement(){
        return "/employee/userManagement";
}
}
