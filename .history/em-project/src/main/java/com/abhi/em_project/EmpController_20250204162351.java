package com.abhi.em_project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmpController {

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String getAllEmployee(){

    }
    
}