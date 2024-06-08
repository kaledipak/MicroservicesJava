package com.es.controller;

import com.es.dtos.EmployeeResponse;
import com.es.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployee(@PathParam("id") Long id){
        EmployeeResponse employeeResponse = employeeService.getEmployee(id);
        if(employeeResponse==null){
           return (ResponseEntity<EmployeeResponse>) ResponseEntity.status(HttpStatus.NOT_FOUND);
        }else{
          return  ResponseEntity.status (HttpStatus.OK).body(employeeResponse);
        }
    }
}
