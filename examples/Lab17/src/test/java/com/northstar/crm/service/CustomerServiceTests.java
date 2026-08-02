package com.northstar.crm.service;

import static org.junit.jupiter.api.Assertions.*;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerServiceTests {
    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        InMemoryCustomerRepository customerRepository = new InMemoryCustomerRepository();
        CustomerValidator validator = new CustomerValidator(customerRepository);
        service = new DefaultCustomerService(customerRepository, validator);
    }

    @Test
    void addAndActivateRaviHappyPath() {
        Customer amina = Customer.amina();
        Customer ravi = Customer.ravi();
        service.addCustomer(ravi);
        service.addCustomer(amina);
        service.changeStatus(ravi.getCustomerId(), CustomerStatus.ACTIVE, "lab-request-001");
        assertEquals(CustomerStatus.ACTIVE, ravi.getStatus());
    }

    @Test
    void duplicateIdThrowsConflict() {
        Customer amina = Customer.amina();
        service.addCustomer(amina);
        assertThrows(BusinessException.class, () -> service.addCustomer(Customer.amina()));
    }

    @Test
    void illegalTransitionThrowsConflict() {
        assertThrows(
                BusinessException.class,
                () ->
                        service.changeStatus(
                                Customer.amina().getCustomerId(),
                                CustomerStatus.PROSPECT,
                                "lab-request-001"));
    }

    @Test
    void missingCustomerThrowsNotFound() {
        assertThrows(
                BusinessException.class,
                () -> service.changeStatus("CUS-9999", CustomerStatus.ACTIVE, "lab-request-001"));
    }
}
