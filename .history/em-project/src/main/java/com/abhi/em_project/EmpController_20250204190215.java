package com.abhi.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    
    List<Employee> employees=new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getAllEmployee(){

        
        return employees;

    }
    
}