package com.es.repository;

import com.es.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {

     Optional<Employee> findById(Long id);
}
