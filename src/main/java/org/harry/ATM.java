package org.harry;

import java.util.Scanner;

public class ATM {
  private Bank gtBank = new Bank();

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {

        String userInput = """
                System.out.print("Welcome to gtBank ATM);
                System.out.print("1. Create Account");
                System.out.print("2. Deposit");
                System.out.print("3. Withdraw");
                System.out.print("4. Transfer);
                System.out.print("5. Check balance");
                System.out.print("6. Exit Application");
                """;
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: gtBank.createAccount();
                    break;
            case 2: deposit();
                    break;
            case 3: withdraw();
                    break;



        }
    }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount <= 0) {
            System.out.println("You can't withdraw negative amount");
        if (amount > 0 && amount < balance){

        }
        }
    }

    private String input (String string){
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        public void deposit(){


        }
    }
