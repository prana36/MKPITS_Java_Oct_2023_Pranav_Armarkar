package com.example.demo.service;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

     public EmployeeDto getAllEmployees(){
         EmployeeDto employeeDto = new EmployeeDto();
         employeeDto.setName("Pranav Armarkar");
         employeeDto.setDepartment("CS");
         employeeDto.setDesignation("Full Stack Developer");


         List<AddressDto> addressList = new ArrayList<AddressDto>();
         AddressDto addressDto = new AddressDto();

         addressDto.setAddressType('p');
         addressDto.setStreet("Hanuman mandir");
         addressDto.setCity("Pune");
         addressDto.setState("Maharashtra");
         addressDto.setCountry("India");

        AddressDto addressDto1 = new AddressDto();

         addressDto1.setAddressType('c');
         addressDto1.setStreet("swaminarayan mandir");
         addressDto1.setCity("nagpur");
         addressDto1.setState("Maharashtra");
         addressDto1.setCountry("India");


         addressList.add(addressDto);
         addressList.add(addressDto1);
         employeeDto.setAddresses(addressList);
         return employeeDto;
     }
}
