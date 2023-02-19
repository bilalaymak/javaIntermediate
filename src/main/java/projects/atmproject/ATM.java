package projects.atmproject;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        //withdraw
        //Deposit
        //Balance
        //exit

        double balance = 100000;
        double withdraw;
        double deposit;

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("ATM");
            System.out.println("1 - Withdraw");
            System.out.println("2 - Deposit");
            System.out.println("3 - Balance");
            System.out.println("4 - Exit");
            System.out.println("Choose the operations you want to perform:");


            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount of money to be withdrawn:");
                    withdraw = sc.nextDouble();

                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please get your money!");
                    } else {
                        System.out.println("Insufficient balance!!!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount of money to be deposited:");
                    deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited!");
                    break;
                case 3:
                    System.out.println("You Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our service!");
                    break;
                default:
                    System.out.println("Incorrect input. Please check your input!!!");

            }
        }
    }













}
