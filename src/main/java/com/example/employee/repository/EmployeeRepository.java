package com.example.employee.repository;

import com.example.employee.controller.response.EmployeeResponse;
import com.example.employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    //fake employee database-employee table
    List<Employee> employeesList=new ArrayList<>();

    //employee-create
    public void  addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    //employee - findAll
    public List<Employee> findAllEmployees(){
        return employeesList;
    }
}
