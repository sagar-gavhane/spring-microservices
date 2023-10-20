package com.sagar.employeeservice.service;

import com.sagar.employeeservice.dto.ApiResponseDto;
import com.sagar.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long email);
}
