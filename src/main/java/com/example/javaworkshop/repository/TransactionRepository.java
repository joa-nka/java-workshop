package com.example.javaworkshop.repository;

import com.example.javaworkshop.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepository {

    private final List<Transaction> transactions = List.of(
            new Transaction(
                    101L,
                    50000,
                    "EUR",
                    "ACC-1001",
                    "ACC-2001"
            ),
            new Transaction(
                    102L,
                    48000,
                    "EUR",
                    "ACC-2001",
                    "ACC-3001"
            )
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