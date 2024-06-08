package com.es.service;

import com.es.dtos.EmployeeResponse;
import com.es.entities.Employee;
import com.es.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponse getEmployee(long id) {

        Optional<Employee> byId = employeeRepository.findById(id);
        if(byId.isPresent()){
            Employee employee = byId.get();

            EmployeeResponse employeeResponse=new EmployeeResponse();
            BeanUtils.copyProperties(employee, employeeResponse);
            return employeeResponse;



        }
        return null;
    }
}
