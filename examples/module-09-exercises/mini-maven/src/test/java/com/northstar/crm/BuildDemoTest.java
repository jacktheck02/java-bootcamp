package com.northstar.crm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BuildDemoTest {
    @Test
    void greetingMatchesBanner() {
        assertEquals("BuildDemo ready for Lab 9", BuildDemo.greeting());
    }
}
