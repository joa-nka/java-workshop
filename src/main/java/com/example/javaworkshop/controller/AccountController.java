package com.example.javaworkshop.controller;

import com.example.javaworkshop.model.Account;
import com.example.javaworkshop.model.Customer;
import com.example.javaworkshop.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @GetMapping("/{id}/owner")
    public Customer getAccountOwner(@PathVariable Long id) {
        return accountService.getAccountOwner(id);
    }
}