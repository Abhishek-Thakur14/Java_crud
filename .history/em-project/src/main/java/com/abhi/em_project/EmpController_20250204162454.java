package com.abhi.em_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @GetMapping("employees")
    public List<employee> getAllEmployee(){
        

    }
    
}