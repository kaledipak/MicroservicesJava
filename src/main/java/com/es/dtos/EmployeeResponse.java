package com.es.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class EmployeeResponse {
    private Long id;
    private String name;
    private String email;
    private String bloodGroup;
}
