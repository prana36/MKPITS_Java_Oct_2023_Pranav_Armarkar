package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.response.EmployeeResponseDto;
import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.mysql.model.Employee;
import com.mkpits.bank.repository.EmployeeRepository;
import com.mkpits.bank.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {


    @Autowired
    EmployeeRepository employeeRepo;


    @Override
    public List<EmployeeResponseDto> getAllEmployees() {

        List<Employee> employeeList = (List<Employee>) employeeRepo.findAll();
        List<EmployeeResponseDto> employeeDtoArrayList = new ArrayList<>();
        for (Employee employee : employeeList){
            EmployeeResponseDto getEmployeeDto =  convertEmployeeModelToEmployeeDto(employee);
            employeeDtoArrayList.add(getEmployeeDto);
        }
        return employeeDtoArrayList;
    }

    private EmployeeResponseDto convertEmployeeModelToEmployeeDto(Employee employee) {


        return EmployeeResponseDto.builder()
                .id(employee.getId())
                .fullName(employee.getFullName())
                .email(employee.getEmail())
                .gender(employee.getGender())
                .mobile(employee.getMobile())
                .aadharNo(employee.getAadharNo())
                .dateOfBirth(employee.getDateOfBirth())
                .state(employee.getState())
                .city(employee.getCity())
                .address(employee.getAddress())
                .build();
   }

   public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto){
        Employee employee = convertEmployeeDtoToEmployeeModel(employeeRequestDto);
        employee.setCreatedAt(LocalDateTime.now());
        employee.setCreatedBy(1);
        employee = employeeRepo.save(employee);

       return convertEmployeeModelToEmployeeDto(employee);
   }

    private Employee convertEmployeeDtoToEmployeeModel(EmployeeRequestDto employeeRequestDto) {
        return Employee.builder()
                .fullName(employeeRequestDto.getFullName())
                .mobile(employeeRequestDto.getMobile())
                .email(employeeRequestDto.getEmail())
                .gender(employeeRequestDto.getGender())
                .dateOfBirth(employeeRequestDto.getDateOfBirth())
                .aadharNo(employeeRequestDto.getAadharNo())
                .build();
    }
}
