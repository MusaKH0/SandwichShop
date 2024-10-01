package com.pluralsight;

import javax.swing.*;
import java.util.*;

public class SandwichShop {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double sandwichSize = promptForSandwichSize("Enter your sandwich size: ");
        double ageDiscount = promptForAge("Enter your age: ");

        double total = (ageDiscount == 0) ? sandwichSize : sandwichSize * ageDiscount;
        System.out.printf("The total cost of the sandwich is: $%.2f", total);

    }

    public static double promptForSandwichSize(String prompt){
        System.out.print(prompt);
        prompt = sc.nextLine().trim().toLowerCase();
        double basePrice = 0;
        if (prompt.equalsIgnoreCase("Regular") || prompt.equals("1")){
            basePrice = 5.45;
            System.out.println("You selected 'Regular'.");
        }
        else if (prompt.equalsIgnoreCase("Large") || prompt.equals("2")){
            basePrice = 8.95;
            System.out.println("You selected 'Large'.");
        }
        else {
            System.out.println("Invalid choice. Please enter 'Regular' or 'Large'.");
        }
        return basePrice;
    }

    public static double promptForAge(String prompt){
        System.out.print(prompt);
        double age = sc.nextDouble();
        double discount = 0;

        if (age <= 17){
            discount = 0.90; // 10% discount
            System.out.println("You get a 10% discount!");
        }
        else if (age >= 65){
            discount = 0.80; // 20% discount
            System.out.println("You get a 20% discount!");
        }
        else {
            System.out.println("Invalid choice. Please enter your age.");
        }
        return discount;
    }


}
