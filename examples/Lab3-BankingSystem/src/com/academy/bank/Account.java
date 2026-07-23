package com.academy.bank;

public abstract class Account implements Printable {
    private static final String ACCOUNT_TYPE = "Account";

    private String accountNumber;
    private double balance;
    private Customer customer;

    protected Account(String accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public abstract void displayAccount();

    double calculateCharges() {
        return 0.0;
    }

    double calculateInterest() {
        return 0.0;
    }

    static String getAccountType() {
        return ACCOUNT_TYPE;
    }

    public abstract boolean deposit(double amount);

    public abstract boolean withdraw(double amount);
}
