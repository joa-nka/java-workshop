package com.example.javaworkshop.model;

public class Account {

    private Long id;
    private String accountNumber;
    private Long ownerId; //point to Customer

    public Account(Long id, String accountNumber, Long ownerId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.ownerId = ownerId;
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getOwnerId() {
        return ownerId;
    }
}