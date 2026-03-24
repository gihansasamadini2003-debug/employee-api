package com.example.employee.controller;

import com.example.employee.controller.request.EmployeeRequest;
import com.example.employee.controller.response.EmployeeResponse;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public void createEmployee(@RequestBody EmployeeRequest employeeRequest) {
        System.out.println("Create Employee Controller");

        System.out.println("Employee Id: ");

        employeeService.createEmployee(employeeRequest);
    }

    

    @GetMapping("/employee")
    public List<EmployeeResponse> getAllEmployee(){

        List<Employee> employeeList =employeeService.findAllEmployees();

        List<EmployeeResponse> employeeResponseList = new ArrayList<>();

        for (Employee employee: employeeList){
            EmployeeResponse employeeResponse=new EmployeeResponse();
            employeeResponse.setEmployeeId(employee.getEmployeeId());
            employeeResponse.setEmployeeFirstName(employee.getEmployeeFirstName());

            employeeResponseList.add(employeeResponse);

        }
        return employeeResponseList;
    }
}
