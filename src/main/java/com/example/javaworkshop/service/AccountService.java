package com.example.javaworkshop.service;

import com.example.javaworkshop.model.Account;
import com.example.javaworkshop.model.Customer;
import com.example.javaworkshop.repository.AccountRepository;
import com.example.javaworkshop.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    public AccountService(AccountRepository accountRepository,
                          CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id);
    }

    public Customer getAccountOwner(Long id) {
        Account account = accountRepository.findById(id);

        if (account == null) {
            return null;
        }

        return customerRepository.findById(account.getOwnerId());
    }
}