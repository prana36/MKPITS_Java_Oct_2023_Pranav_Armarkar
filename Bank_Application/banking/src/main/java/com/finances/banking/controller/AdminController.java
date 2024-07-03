package com.finances.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminDashBoard(){

        return "/admin/index";
    }

    @GetMapping("/admin/dashboard/usermanagement")
    public  String adminUserManagement(){
        return "/admin/userManagement";
    }

    @GetMapping("/admin/dashboard/employeemanagement")
    public  String adminEmployeeManagement(){
        return "/admin/employeeManagement";
    }
}
