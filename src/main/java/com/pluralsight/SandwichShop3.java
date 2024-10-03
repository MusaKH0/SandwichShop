package com.pluralsight;

import java.util.Scanner;

public class SandwichShop3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        double priceOfBaseRegular = 5.45;
        double priceOfBaseLarge = 8.95;

        double priceOfLoadedRegular = 1.00;
        double priceOfLoadedLarge = 1.75;

        int sandwichSize = promptForSandwichSize();
        double sandwichBasePrice = (sandwichSize == 1) ? priceOfBaseRegular : priceOfBaseLarge;

        boolean isLoaded = promptForLoadedSandwich();
        double loadedSurcharge = (isLoaded) ? ((sandwichSize == 1) ? priceOfLoadedRegular : priceOfLoadedLarge) : 0.0;

        double discount = promptForAgeDiscount();

        double totalPrice = (sandwichBasePrice + loadedSurcharge) * discount;

        System.out.printf("The total cost of the sandwich is: $%.2f", totalPrice);
    }


    public static int promptForSandwichSize() {
        System.out.print("Enter your sandwich size. 1 for Regular, 2 for Large: ");
        int userSelection = sc.nextInt();
        sc.nextLine();

        if (userSelection == 1) {
            System.out.println("You selected 'Regular'.");
        } else if (userSelection == 2) {
            System.out.println("You selected 'Large'.");
        } else {
            System.out.println("Invalid selection.");
        }

        return userSelection;
    }

    public static boolean promptForLoadedSandwich() {
        System.out.print("Do you want a loaded sandwich (yes/no)? ");
        String userInput = sc.nextLine().toLowerCase();

        return userInput.equals("yes");
    }

    public static double promptForAgeDiscount() {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age <= 17) {
            System.out.println("You get a 10% discount!");
            return 0.90;  // 10% discount
        } else if (age >= 65) {
            System.out.println("You get a 20% discount!");
            return 0.80;  // 20% discount
        } else {
            return 1.00;  // No discount
        }
    }
}

