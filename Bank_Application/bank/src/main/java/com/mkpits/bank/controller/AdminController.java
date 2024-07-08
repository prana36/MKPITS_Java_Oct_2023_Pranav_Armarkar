package com.mkpits.bank.controller;

import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.dto.response.AddressResponseDto;
import com.mkpits.bank.dto.response.EmployeeResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IAddressService;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    IUserService iUserService;

    @Autowired
    IAccountService iAccountService;

    @Autowired
    IEmployeeService iEmployeeService;

    @Autowired
    IAddressService iAddressService;

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "/admin/index";
    }


    @GetMapping("/admin/dashboard/usermanagement")
    public String adminUserManagement(Model model) {

        List<UserResponseDto> products = iUserService.getAllUsers();
        model.addAttribute("userManagement", products);
        return "admin/userManagement";

    }

    @GetMapping("/admin/dashboard/employeemanagement")
    public String adminEmployeeManagement(Model model) {
        List<EmployeeResponseDto> employeeGetResponseDtoList =  iEmployeeService.getAllEmployees();
        model.addAttribute("employeeManagement",employeeGetResponseDtoList);

        return "/admin/employeeManagement";
    }

//    @GetMapping("/admin/dashboard/usermanagement/customer-accounts")
//    public  String customerAcc(){
//        return "/admin/customer-accounts";
//    }
//
//}

    @GetMapping("/admin/dashboard/customerdetails/{userId}")
    public String adminCustomerAccounts(@PathVariable("userId") Integer userId, Model model) {
        //to get detail of perticular id of user
        UserResponseDto userResponseDto = iUserService.getUserByUserId(userId);
        //to get list of accounts of user
        List<AccountResponseDto> accountResponceDto = iAccountService.getAllUserAccounts(userId);

        AddressResponseDto addressResponseDto = iAddressService.getAddress(userId);

        model.addAttribute("customerDetalis", userResponseDto);
        model.addAttribute("customerDetailsFromAccount", accountResponceDto);
        model.addAttribute("customerAddress" , addressResponseDto);
        return "admin/customer-accounts";
    }


    @GetMapping("/admin/dashboard/employeemanagement/registrationform")
    public String userRegistrationForm(){
        return "admin/registration";
    }

    //    @PostMapping("/admin/dashboard/employeemanagement/getregistrationform")
//    public String getuserRegistrationForm(@RequestBody UserRequestDto userRequestDto){
//        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);
//
//        return "admin/userManagement";
//    }
    @PostMapping("/admin/dashboard/usermanagment/register")
    public String registerUser( @ModelAttribute UserRequestDto userRequestDto, Model model) {


        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);

        model.addAttribute("user", userResponseDto);
        return "admin/userManagement"; // The view name of the success page
    }

//    @PostMapping()
}
