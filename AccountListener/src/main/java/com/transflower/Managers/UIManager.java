package com.transflower.Managers;

import java.util.Scanner;

public class UIManager {

    public void showMenu() {

        Scanner sc = new Scanner(System.in);
        AccountManager mgr = new AccountManager();

        while (true) {

            System.out.println("\n**************************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Credit");
            System.out.println("3. Debit");
            System.out.println("4. Fund Transfer");
            System.out.println("5. Exit");
            System.out.println("**************************************");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.print("Enter Account Id: ");
                    int accountId = sc.nextInt();
                    break;
                }

                case 2: {
                    System.out.print("Enter Account Id: ");
                    int accountId = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    mgr.deposit(accountId, amount);
                    System.out.println("Amount credited successfully.");
                    break;
                }

                case 3: {
                    System.out.print("Enter Account Id: ");
                    int accountId = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    mgr.withdraw(accountId, amount);
                    System.out.println("Amount debited successfully.");
                    break;
                }

                case 4: {
                    System.out.print("Enter From Account Id: ");
                    int fromAccountId = sc.nextInt();

                    System.out.print("Enter To Account Id: ");
                    int toAccountId = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    boolean status = mgr.FundTransfer(
                            fromAccountId,
                            toAccountId,
                            amount);

                    if (status) {
                        System.out.println("Fund Transfer Successful.");
                    } else {
                        System.out.println("Fund Transfer Failed.");
                    }
                    break;
                }

                case 5:
                    System.exit(0);                

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}