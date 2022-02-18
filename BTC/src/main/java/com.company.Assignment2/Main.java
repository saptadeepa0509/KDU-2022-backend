package com.company.Assignment2;

import com.company.Assignment2.Operations.LoadJsonData;
import com.company.Assignment2.Operations.StartThread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TransactionDetails user = new TransactionDetails();
        new StartThread().start();
        while (true) {
            System.out.println("1.Given the name or code of a coin, retrieve all its details.");
            System.out.println("2.Display top N coins in the market based on price");
            System.out.println("3.For a given trader, show his portfolio.");
            System.out.println("4.For a given trader, display the total profit or loss they have made trading in the crypto market.");
            System.out.println("5.Show top N traders based on their profit/loss.");
            System.out.println("6.Show Bottom N traders based on their profit/loss.");
            System.out.println("7.Exit");
            System.out.println("Enter option");
            int opt = Integer.parseInt(sc.nextLine());
            if (opt == 7) break;
            switch (opt) {
                case 1:
                    System.out.println("Enter name/code");
                    System.out.println(user.getCoinDetails(sc.nextLine()));
                    break;
                case 2:
                    System.out.println("Enter value of N");
                    user.displayTopCoin(Integer.parseInt(sc.nextLine()));
                    break;
                case 3:
                    System.out.println("Enter First name and Last name of Trader");
                    user.displayPortfolio(sc.nextLine(), sc.nextLine());
                    break;
                case 4:
                    System.out.println("Enter First name and Last name of Trader");
                    user.displayNetValue(sc.nextLine(), sc.nextLine());
                    break;
                case 5:
                    System.out.println("Enter N");
                    user.displayTopN(Integer.parseInt(sc.nextLine()));
                    break;
                case 6:
                    System.out.println("Enter N");
                    user.displayBottomN(Integer.parseInt(sc.nextLine()));
                    break;
                default:
                    System.out.println("Wrong choice-Try again");
            }
        }
    }
}
