package com.es.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/employee")
public class EmployeeController {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello";
    }
}
