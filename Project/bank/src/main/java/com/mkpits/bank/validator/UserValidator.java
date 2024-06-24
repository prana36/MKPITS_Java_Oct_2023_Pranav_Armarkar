package com.mkpits.bank.validator;

import com.mkpits.bank.exception.BussinessException;
import com.mkpits.bank.exception.NotFoundException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserValidator
{
    // at the time of get
    public boolean validateId(Integer userId){

        if (userId == null){
            throw new NotFoundException("File Not Found");
        }else {
            return true;
        }

    }


    // at the time of create (POST)
    public boolean validateAge(LocalDate dateOfBirth)  {

        if (dateOfBirth == null){
            throw new BussinessException("Date of birth cannot be null!!!");

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



}
