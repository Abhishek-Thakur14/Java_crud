package com.abhi.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {
    
    List<Employee> employees=new ArrayList<>();
    
    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        return employees;


        // Employee emp = new Employee();
        // emp.setName("Abhishek");
        // emp.setPhone("6203783634");
        // emp.setEmail("abhi@gmail.com");

        // employees.add(null);
        // employees.add(emp);



    }

    @PostMapping("employees")
    public String createEmplo(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    
}