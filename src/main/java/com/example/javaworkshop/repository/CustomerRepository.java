package com.example.javaworkshop.repository;

import com.example.javaworkshop.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    private final List<Customer> customers = List.of(
            new Customer(1L, "Alice Brown", "PERSON"),
            new Customer(2L, "Mark Wilson", "PERSON"),
            new Customer(3L, "Northstar Consulting Ltd.", "COMPANY")
    );

    public Customer findById(Long id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}