package com.example.javaworkshop.repository;

import com.example.javaworkshop.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepository {

    private final List<Account> accounts = List.of(
            new Account(1001L, "ACC-1001", 1L),
            new Account(2001L, "ACC-2001", 2L),
            new Account(3001L, "ACC-3001", 3L)
    );

    public Account findById(Long id) {
        return accounts.stream()
                .filter(account -> account.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}