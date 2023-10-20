package com.sagar.employeeservice.controller;

import com.sagar.employeeservice.dto.ApiResponseDto;
import com.sagar.employeeservice.dto.EmployeeDto;
import com.sagar.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto employeeDto1 = employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponseDto> getEmployeesByEmail(@PathVariable("id") Long id) {
        ApiResponseDto apiResponseDto = employeeService.getEmployeeById(id);

        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
