package com.northstar.crm.dto;

public class CustomerRequest {
    private final String name;
    private final String email;

    public CustomerRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
}
