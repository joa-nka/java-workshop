package com.example.javaworkshop.model;

public class Transaction {

    private Long id;
    private double amount;
    private String currency;
    private String fromAccount;
    private String toAccount;

    public Transaction(Long id, double amount, String currency,
                       String fromAccount, String toAccount) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }
}