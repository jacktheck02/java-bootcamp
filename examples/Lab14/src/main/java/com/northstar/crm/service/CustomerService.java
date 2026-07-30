package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Lab 12-shaped clean API baseline for Lab 14 DTO boundary. */
public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();

    public Customer createCustomer(Customer customer) {
        String customerId = customer.getCustomerId();
        String fullName = customer.getFullName();
        if (customerId == null || customerId.isBlank() || fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("customerId and fullName are required");
        }
        if (findByCustomerId(customerId).isPresent()) {
            throw new IllegalStateException("Duplicate customerId: " + customerId);
        }
        customers.add(customer);
        return customer;
    }

    public Customer getCustomer(String customerId) {
        return findByCustomerId(customerId)
                .orElseThrow(
                        () -> new IllegalArgumentException("Customer not found: " + customerId));
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        return customers.stream().filter(c -> c.getCustomerId().equals(customerId)).findFirst();
    }
}
