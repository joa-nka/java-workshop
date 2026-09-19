package com.example.javaworkshop.model;

public class Customer {

    private Long id;
    private String name;
    private String type; //PERSON or COMPANY

    public Customer(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}