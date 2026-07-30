package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    private final Map<String, Customer> customersById = new HashMap<>();

    private boolean hasUniqueId(String customerId) {
        return !customersById.containsKey(customerId);
    }

    public Customer createCustomer(
            String customerId, String fullName, String email, String phone, CustomerStatus status) {
        if (!hasUniqueId(customerId)) {
            throw new IllegalStateException("Customer Id: " + customerId + " is not unique");
        }

        Customer newCustomer =
                new Customer(customerId, fullName, email, phone, status, LocalDateTime.now());
        customersById.put(customerId, newCustomer);
        return newCustomer;
    }

    public Customer getCustomer(String customerId) {
        Customer found = customersById.get(customerId);
        if (found == null) {
            throw new IllegalArgumentException(
                    "Customer not found: " + customerId + " correlationId=" + correlationId());
        }
        return found;
    }

    private String correlationId() {
        return "lab-request-001";
    }

    public Customer updateStatus(String customerId, CustomerStatus newStatus) {
        Customer updateCustomer = customersById.get(customerId);
        updateCustomer.setStatus(newStatus);
        return updateCustomer;
    }
}
