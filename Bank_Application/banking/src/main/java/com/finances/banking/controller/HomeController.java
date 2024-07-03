package com.finances.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/customer/login")
    public String userLogin(){

        return "/customer/login";
    }

    @GetMapping("/login")
    public String adminLogin(){

        return "/admin/login";
    }

    @GetMapping("/forgot_password")
    public String forgotPassword(){

        return "/forgot-password";
    }
}
