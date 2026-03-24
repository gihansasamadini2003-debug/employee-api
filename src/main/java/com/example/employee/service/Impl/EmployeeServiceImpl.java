package com.example.employee.service.Impl;

import com.example.employee.controller.request.EmployeeRequest;
import com.example.employee.controller.response.EmployeeResponse;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(EmployeeRequest employeeRequest) {

        Employee employee=new Employee();
        employee.setEmployeeId(employeeRequest.getEmployeeId());
        employee.setEmployeeFirstName(employeeRequest.getEmployeeFirstName());
        employee.setEmployeeLastName(employeeRequest.getEmployeeLastName());
        employee.setEmployeeEmail(employeeRequest.getEmployeeEmail());
        employee.setEmployeePhone(employeeRequest.getEmployeePhone());

        employeeRepository.addEmployee(employee);



    }

    @Override
    public List<Employee> findAllEmployees() {

        return employeeRepository.findAllEmployees();


    }
}
