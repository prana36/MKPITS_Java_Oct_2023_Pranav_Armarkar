package com.mkpits.bank.service;

import com.mkpits.bank.dto.response.EmployeeResponseDto;

import java.util.List;

public interface IEmployeeService {
    List<EmployeeResponseDto> getAllEmployees();
}
