package com.abhi.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        List<Employee> employees=new ArrayList<>();

        Employee emp = new Employee();
        emp = "Abhishek";
        emp.phone = "6203783634";
        emp.email = "abhi@gmail.com";

        employees.add(null);
        return employees;

    }
    
}