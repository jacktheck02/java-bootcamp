package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import com.northstar.crm.repository.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer create(Customer input) {
        MDC.put("customerId", input.getCustomerId());
        MDC.put("op", "customer.create");
        try {
            log.info("Creating customer");
            Customer saved = repository.save(input);
            log.info("Customer created status={}", saved.getStatus());
            return saved;
        } catch (Exception e) {
            log.error("Create failed", e);
            throw e;
        } finally {
            MDC.remove("customerId");
            MDC.remove("op");
        }
    }

    public Optional<Customer> findById(String id) {
        MDC.put("customerId", id);
        MDC.put("op", "customer.get");
        try {
            log.info("Loading customer");
            return repository.findById(id);
        } finally {
            MDC.remove("customerId");
            MDC.remove("op");
        }
    }
}
