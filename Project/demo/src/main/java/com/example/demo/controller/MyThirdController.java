package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyThirdController {


    @RequestMapping("/name/jd")
    public String getJobDiscription(){

        return "Full Stack Developer";
    }
    @RequestMapping("/name/jd/jobdetail")
    public String getJobDetails(){

        return "Vella developer";
    }
}
