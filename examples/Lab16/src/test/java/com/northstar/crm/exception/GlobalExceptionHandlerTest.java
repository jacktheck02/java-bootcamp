package com.northstar.crm.exception;

import static org.junit.jupiter.api.Assertions.*;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.entity.CustomerStatus;

import jakarta.validation.Validation;
import jakarta.validation.Validator;

import org.junit.jupiter.api.Test;

class GlobalExceptionHandlerTest {
    GlobalExceptionHandler handler = new GlobalExceptionHandler();
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    void mapsNotFound() {
        var err = handler.fromBusiness(BusinessException.notFound("CUS-9999", "lab-request-001"));
        assertEquals(404, err.getStatusHint());
        assertEquals("lab-request-001", err.getCorrelationId());
    }

    @Test
    void mapsValidationEmail() {
        var request =
                new CustomerRequestDTO(
                        "CUS-9999",
                        "name here",
                        "not-an-email",
                        String.valueOf(CustomerStatus.ACTIVE));
        var violations = validator.validate(request);
        var err = handler.fromValidation(violations, "lab-request-001");
        assertEquals(400, err.getStatusHint());
        assertTrue(err.getErrorMap().containsKey("email"));
    }

    @Test
    void mapsConflict() {
        var err =
                handler.fromBusiness(
                        BusinessException.conflict(
                                "illegal status transition ACTIVE -> PROSPECT", "lab-request-001"));
        assertEquals(409, err.getStatusHint());
    }
}
