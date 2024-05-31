package com.example.demo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    EmployeeService employeeServiceSetter = new EmployeeService();

    EmployeeService employeeServiceConstructor = new EmployeeService();

    public EmployeeController(EmployeeService employeeServiceConstructor) {
        this.employeeServiceConstructor = employeeServiceConstructor;
    }
        @RequestMapping("/employees")
        public ResponseEntity<Object> getEmployee()
        {

        EmployeeService employeeServiceNormal = new EmployeeService();
            System.out.println("Nomal EMP service: "+employeeServiceNormal);

            EmployeeDto employeeDto3 = employeeServiceNormal.getAllEmployees();

            System.out.println("Setter EMP Service: " + employeeServiceSetter.hashCode());
            EmployeeDto employeeDto1 = employeeServiceSetter.getAllEmployees();

            System.out.println("Constructor EMP Service: " + employeeServiceConstructor.hashCode());
            EmployeeDto employeeDto2 = employeeServiceConstructor.getAllEmployees();
            return null;
        }



}
