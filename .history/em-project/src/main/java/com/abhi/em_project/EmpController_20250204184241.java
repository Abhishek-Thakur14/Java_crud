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
        emp.setN/ame("Abhishek");
        // emp.setPhone("6203783634");
        // emp.setEmail("abhi@gmail.com");

        employees.add(null);
        employees.add(emp);
        return employees;

    }
    
}