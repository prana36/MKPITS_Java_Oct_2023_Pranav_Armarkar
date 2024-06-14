package com.example.demo.validator;


import com.example.demo.exception.BussinessException;
import com.example.demo.exception.NotFoundException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class UserValidator
{
    public boolean validateAge(LocalDate dateOfBirth)  {

        if (dateOfBirth == null){
            throw new BussinessException("Date of birth cannot be null!!!");
//            return false;

        }else {
            LocalDate currentDate = LocalDate.now();
            int age = currentDate.getYear()-dateOfBirth.getYear();

            if (age < 18) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean validateId(Integer id){

        if (id == null){
            throw new NotFoundException("File Not Found");
        }else {
            return true;
        }

    }
}
