package com.northstar.crm.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.northstar.crm.model.Customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerApiIT {

    @LocalServerPort int port;

    @Autowired TestRestTemplate rest;

    @Test
    void createAndGetCus1001() {
        var headers = new HttpHeaders();
        headers.set("X-Correlation-Id", "lab-request-001");
        headers.setContentType(MediaType.APPLICATION_JSON);
        var body =
                """
                {"customerId":"CUS-1001","fullName":"Amina Khan","status":"ACTIVE"}
                """;
        var created =
                rest.exchange(
                        "http://localhost:" + port + "/api/customers",
                        HttpMethod.POST,
                        new HttpEntity<>(body, headers),
                        Customer.class);
        assertEquals(true, created.getStatusCode().equals(HttpStatus.CREATED));
        assertEquals(
                true, created.getHeaders().getFirst("X-Correlation-Id").equals("lab-request-001"));
        var got = rest.getForEntity("/api/customers/CUS-1001", Customer.class);
        assertEquals(true, got.getBody().getCustomerId().equals("CUS-1001"));
    }

    // @Test
    // void getAminaReturns200() {
    //     // TODO: GET /api/customers/CUS-1001 → 200; body customerId CUS-1001
    //     throw new UnsupportedOperationException("TODO: API get happy path");
    // }
    //
    // @Test
    // void createEchoesCorrelationHeader() {
    //     // TODO: POST with X-Correlation-Id lab-request-001 → 201 + header echo
    //     throw new UnsupportedOperationException("TODO: API create + correlation");
    // }
    //
    // @Test
    // void missingCustomerReturns404() {
    //     // TODO: GET CUS-9999 → 404
    //     throw new UnsupportedOperationException("TODO: API 404");
    // }
}
