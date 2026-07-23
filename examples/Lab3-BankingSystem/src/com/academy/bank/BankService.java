package com.academy.bank;

import java.util.Scanner;

public class BankService {
    private static final int MAX_CUSTOMERS = 50;
    private static final int MAX_ACCOUNTS = 100;
    private static final int MAX_TRANSACTIONS = 500;

    private final Customer[] customers = new Customer[MAX_CUSTOMERS];
    private final Account[] accounts = new Account[MAX_ACCOUNTS];
    private final Transaction[] transactions = new Transaction[MAX_TRANSACTIONS];

    private int customerCount = 0;
    private int accountCount = 0;
    private int transactionCount = 0;
    private int nextAccountNumber = 10001;
    private int nextTransactionNumber = 1;

    private final Scanner scanner;

    public BankService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void createCustomer() {
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer Email: ");
        String email = scanner.nextLine();
        System.out.print("Customer Phone Number: ");
        String phone = scanner.nextLine();

        Customer newCustomer = new Customer(customerId, name, email, phone);

        customers[customerCount++] = newCustomer;

        System.out.println("Customer Created Successfully.");
    }

    private int searchCustomer(String customerId) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerId().equals(customerId)) {
                return i;
            }
        }

        return -1;
    }

    private int searchAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return i;
            }
        }

        return -1;
    }

    public void deposit() {
        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();

        int accountIndex = searchAccount(accountNumber);

        if (accountIndex == -1) {
            System.out.println("Invalid Account Number");
            return;
        }

        System.out.print("Amount to Deposit: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Amount");
            return;
        }

        if (!accounts[accountIndex].deposit(amount)) {
            System.out.println("Unable to make deposit");
            return;
        }

        Transaction transaction =
                new Transaction(
                        String.valueOf(nextTransactionNumber++),
                        amount,
                        "deposit",
                        "July 22",
                        accounts[accountIndex].getAccountNumber());

        transactions[transactionCount++] = transaction;

        System.out.println("Balance updated : " + accounts[accountIndex].getBalance());
    }

    public void withdraw() {
        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();

        int accountIndex = searchAccount(accountNumber);

        if (accountIndex == -1) {
            System.out.println("Invalid Account Number");
            return;
        }

        System.out.print("Amount to Withdraw: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Amount");
            return;
        }

        if (!accounts[accountIndex].withdraw(amount)) {
            System.out.println("Unable to make deposit");
            return;
        }

        Transaction transaction =
                new Transaction(
                        String.valueOf(nextTransactionNumber++),
                        amount,
                        "withdraw",
                        "July 22",
                        accounts[accountIndex].getAccountNumber());

        transactions[transactionCount++] = transaction;

        System.out.println("Balance updated : " + accounts[accountIndex].getBalance());
    }

    public void displayAccounts() {
        for (int i = 0; i < accountCount; i++) {
            accounts[i].printDetails();
        }
    }

    public void displayCustomers() {
        for (int i = 0; i < customerCount; i++) {
            customers[i].printDetails();
        }
    }

    public void createSavingsAccount() {
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();

        int customerIndex = searchCustomer(customerId);

        if (customerIndex == -1) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.print("Balance: ");
        double balance;
        try {
            balance = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance");
            return;
        }

        System.out.print("Interest Rate: ");
        int interestRate;
        try {
            interestRate = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid interest rate");
            return;
        }

        Account newSavingsAccount =
                new SavingsAccount(
                        String.valueOf(nextAccountNumber++),
                        balance,
                        customers[customerIndex],
                        interestRate);

        accounts[accountCount++] = newSavingsAccount;

        System.out.printf(
                "Savings Account Created.\n"
                        + "Account Number : %s\n"
                        + "Balance : %.2f%n"
                        + "Interest Rate : %d\n",
                newSavingsAccount.getAccountNumber(), balance, interestRate);
    }

    public void createCurrentAccount() {
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();

        int customerIndex = searchCustomer(customerId);

        if (customerIndex == -1) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.print("Balance: ");
        double balance;
        try {
            balance = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance");
            return;
        }

        System.out.print("Transaction Fee: ");
        double transactionFee;
        try {
            transactionFee = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid transaction fee");
            return;
        }

        Account newCurrentAccount =
                new CurrentAccount(
                        String.valueOf(nextAccountNumber++),
                        balance,
                        customers[customerIndex],
                        transactionFee);

        accounts[accountCount++] = newCurrentAccount;

        System.out.printf(
                "Current Account Created.\n"
                        + "Account Number : %s\n"
                        + "Balance : %.2f%n"
                        + "Transaction Fee : %d\n",
                newCurrentAccount.getAccountNumber(), balance, (int) transactionFee);
    }
}
