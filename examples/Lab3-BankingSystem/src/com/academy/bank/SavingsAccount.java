package com.academy.bank;

public class SavingsAccount extends Account {
    private static final String ACCOUNT_TYPE = "Savings";

    private int interestRate;

    SavingsAccount(String accountNumber, double balance, Customer customer, int interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return this.getBalance() * this.interestRate / 100;
    }

    public void displayAccount() {
        System.out.printf(
                "Savings Account\n"
                        + "Account Number : %s\n"
                        + "Customer : %s\n"
                        + "Balance : %.2f\n"
                        + "Interest Rate : %d\n"
                        + "Interest : %.2f\n",
                super.getAccountNumber(),
                super.getCustomer().getCustomerId(),
                super.getBalance(),
                this.interestRate,
                this.calculateInterest());
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
