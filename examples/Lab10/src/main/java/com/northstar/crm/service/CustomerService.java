package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CustomerService {

    private final List<Customer> customers = new ArrayList<>();

    public Customer addCustomer(Customer customer) {
        Objects.requireNonNull(customer, "customer must not be null");
        String id = customer.getCustomerId();
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("customerId must not be blank");
        }
        if (findByCustomerId(id).isPresent()) {
            throw new IllegalStateException("Duplicate customerId: " + id);
        }
        customers.add(customer);
        return customer;
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        if (customerId == null) {
            return Optional.empty();
        }
        return customers.stream()
                .filter(c -> customerId.equals(c.getCustomerId()))
                .findFirst();
    }

    public List<Customer> findByStatus(CustomerStatus status) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : customers) {
            if (c.getStatus() == status) {
                result.add(c);
            }
        }
        return result;
    }

    public Customer updateStatus(String customerId, CustomerStatus newStatus) {
        Objects.requireNonNull(customerId, "customerId must not be null");
        Objects.requireNonNull(newStatus, "newStatus must not be null");
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            if (customerId.equals(c.getCustomerId())) {
                Customer updated = new Customer(
                        c.getCustomerId(),
                        c.getFullName(),
                        c.getEmail(),
                        c.getPhone(),
                        newStatus,
                        c.getCreatedAt());
                customers.set(i, updated);
                return updated;
            }
        }
        throw new IllegalArgumentException("Customer not found: " + customerId);
    }

    public List<Customer> listAll() {
        return Collections.unmodifiableList(new ArrayList<>(customers));
    }
}
