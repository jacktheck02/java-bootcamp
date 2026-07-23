package com.academy.bank;

public class CurrentAccount extends Account {
    private static final String ACCOUNT_TYPE = "Current";

    private double transactionFee;

    CurrentAccount(String accountNumber, double balance, Customer customer, double transactionFee) {
        super(accountNumber, balance, customer);
        this.transactionFee = transactionFee;
    }

    double calculateCharges() {
        return this.transactionFee;
    }

    public void displayAccount() {
        System.out.printf(
                "Current Account\n"
                        + "Account Number : %s\n"
                        + "Customer : %s\n"
                        + "Balance : %.2f\n"
                        + "Transaction Fee : %d\n",
                super.getAccountNumber(),
                super.getCustomer().getCustomerId(),
                super.getBalance(),
                this.transactionFee);
    }

    public void printDetails() {
        displayAccount();
    }

    public static String getAccountType() {
        return ACCOUNT_TYPE;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }

        super.setBalance(super.getBalance() + amount);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || super.getBalance() - amount < 0) {
            return false;
        }

        super.setBalance(super.getBalance() - amount);
        return true;
    }
}
