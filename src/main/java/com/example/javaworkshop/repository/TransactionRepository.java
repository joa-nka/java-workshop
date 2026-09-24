package com.example.javaworkshop.repository;

import com.example.javaworkshop.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepository {

    private final List<Transaction> transactions = List.of(
            new Transaction(102L, 47250, "EUR", "ACC-2001", "ACC-3001"),
            new Transaction(103L, 12500, "USD", "ACC-3001", "ACC-1001"),
            new Transaction(104L, 1950, "EUR", "ACC-1001", "ACC-3001"),
            new Transaction(105L, 31200, "GBP", "ACC-2001", "ACC-1001"),
            new Transaction(101L, 50375, "EUR", "ACC-1001", "ACC-2001")
    );

    public List<Transaction> findAll() {
        return transactions;
    }

    public Transaction findById(Long id) {
        return transactions.stream()
                .filter(transaction -> transaction.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}