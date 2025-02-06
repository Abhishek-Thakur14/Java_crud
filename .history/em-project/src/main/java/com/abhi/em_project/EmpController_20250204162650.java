package com.abhi.em_project;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        List<Employee> employees=new ArrayList<>();
        return employees;

    }
    
}