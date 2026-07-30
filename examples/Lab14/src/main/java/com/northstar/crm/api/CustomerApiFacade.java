package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerMapper;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.util.Set;
import java.util.stream.Collectors;

/** API edge: validate → map → service → response DTO. Correlation: lab-request-001 on failures. */
public class CustomerApiFacade {
    private final CustomerService service;
    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public CustomerApiFacade(CustomerService service) {
        this.service = service;
    }

    public CustomerResponseDTO create(CustomerRequestDTO request, String correlationId) {
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(request);
        if (!violations.isEmpty()) {
            String detail =
                    violations.stream()
                            .map(v -> v.getPropertyPath() + ": " + v.getMessage())
                            .collect(Collectors.joining("; "));
            throw new IllegalArgumentException(
                    "validation failed [" + correlationId + "]: " + detail);
        }
        var saved = service.createCustomer(CustomerMapper.toEntity(request));
        return CustomerMapper.toResponse(saved);
    }

    public CustomerResponseDTO getById(String customerId, String correlationId) {
        var entity =
                service.findByCustomerId(customerId) // or findById — match your API
                        .orElseThrow(
                                () ->
                                        new IllegalArgumentException(
                                                "customer not found ["
                                                        + correlationId
                                                        + "]: "
                                                        + customerId));
        return CustomerMapper.toResponse(entity);
    }

    private void validateOrThrow(CustomerRequestDTO request, String correlationId) {
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(request);
        if (!violations.isEmpty()) {
            String msg =
                    violations.stream()
                            .map(v -> v.getPropertyPath() + ": " + v.getMessage())
                            .collect(Collectors.joining("; "));
            // TODO: log correlationId + msg (no secrets)
            throw new IllegalArgumentException("[" + correlationId + "] " + msg);
        }
    }
}
