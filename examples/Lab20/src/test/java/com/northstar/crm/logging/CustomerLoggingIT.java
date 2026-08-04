package com.northstar.crm.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(OutputCaptureExtension.class)
class CustomerLoggingIT {

    @LocalServerPort int port;

    @Autowired TestRestTemplate rest;

    @Test
    void createLogsIdsNotPii(CapturedOutput output) {
        // POST CUS-1001 with X-Correlation-Id: lab-request-001
        assertEquals(true, output.getOut().contains("CUS-1001"));
        assertEquals(true, output.getOut().contains("lab-request-001"));
        assertEquals(true, output.getOut().contains("customer.create"));
        assertEquals(true, !output.getOut().contains("Amina"));
    }
}
