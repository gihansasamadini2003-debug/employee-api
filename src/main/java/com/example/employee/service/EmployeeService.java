package com.example.employee.service;

import com.example.employee.controller.request.EmployeeRequest;
import com.example.employee.controller.response.EmployeeResponse;
import com.example.employee.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeService {

    void createEmployee(EmployeeRequest employeeRequest);

    List<Employee> findAllEmployees();
}
