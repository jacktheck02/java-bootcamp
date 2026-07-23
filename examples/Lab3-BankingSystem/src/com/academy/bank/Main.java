package com.academy.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        try (Scanner scanner = new Scanner(System.in)) {
            BankService bankService = new BankService(scanner);
            int choice;
            while (flag) {
                System.out.printf(
                        "================================\n"
                                + "Bank Management System\n"
                                + "================================\n"
                                + "1 Create Customer\n"
                                + "2 Create Savings Account\n"
                                + "3 Create Current Account\n"
                                + "4 Deposit\n"
                                + "5 Withdraw\n"
                                + "6 Display Accounts\n"
                                + "7 Display Customers\n"
                                + "8 Exit\n"
                                + "Choice : ");

                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice");
                    continue;
                }

                switch (choice) {
                    case 1:
                        bankService.createCustomer();
                        break;
                    case 2:
                        bankService.createSavingsAccount();
                        break;
                    case 3:
                        bankService.createCurrentAccount();
                        break;
                    case 4:
                        bankService.deposit();
                        break;
                    case 5:
                        bankService.withdraw();
                        break;
                    case 6:
                        bankService.displayAccounts();
                        break;
                    case 7:
                        bankService.displayCustomers();
                        break;
                    case 8:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
