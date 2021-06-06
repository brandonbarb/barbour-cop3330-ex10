/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the price of item 1: ");
        Scanner input = new Scanner(System.in);
        float price1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        float price2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        float price3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();

        float sub = ((price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3));
        float tax = (float) (sub * 0.055);
        float total = sub + tax;

        System.out.printf("Subtotal: $%.2f\n", sub);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
