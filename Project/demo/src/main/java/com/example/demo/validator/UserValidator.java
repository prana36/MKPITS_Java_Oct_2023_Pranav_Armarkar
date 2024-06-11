package com.example.demo.validator;


import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class UserValidator
{
    public boolean validateAge(LocalDate dateOfBirth){

        if (dateOfBirth == null){
            return false;
        }else {
            LocalDate currentDate = LocalDate.now();
            int age = currentDate.getYear()-dateOfBirth.getYear();

            return age >= 18;
        }
//        return false;
    }

}
