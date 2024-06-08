package com.es.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "blood_group")
    private String bloodGroup;



}
