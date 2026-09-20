package com.example.javaworkshop.controller;

import com.example.javaworkshop.model.Account;
import com.example.javaworkshop.model.Customer;
import com.example.javaworkshop.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
@Tag(name = "Accounts", description = "API for managing accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get account by ID", description = "Retrieve account details by its ID")
    public Account getAccountById(@Parameter(description = "ID of the account to retrieve") @PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @GetMapping("/{id}/owner")
    @Operation(summary = "Get account owner", description = "Retrieve the owner of a specific account by its ID")
    public Customer getAccountOwner(@Parameter(description = "ID of the account to retrieve the owner for") @PathVariable Long id) {
        return accountService.getAccountOwner(id);
    }
}