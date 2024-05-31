package com.pluralsight;

import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void startOrder() {
        Order order = new Order();

        while (true) {
            System.out.println("Create a new sandwich (Y/N):");
            String response = scanner.nextLine().toUpperCase();
            if (!response.equals("Y"))
                break;

            System.out.println("Enter sandwich size (4\", 8\", 12\"): ");
            String size = scanner.nextLine();

            System.out.println("Enter bread type (white, wheat, rye, wrap): ");
            String breadType = scanner.nextLine();

            Sandwich sandwich = new Sandwich(size, breadType);

            System.out.println("Add regular toppings (comma-separated list, or type 'done' to finish): ");
            String regularToppingsInput = scanner.nextLine();
            if (!regularToppingsInput.equalsIgnoreCase("done")) {
                String[] regularToppings = regularToppingsInput.split(",");
                for (String topping : regularToppings) {
                    sandwich.RegularTopping(topping.trim());
                }
            }

            System.out.println("Add premium toppings (comma-separated list, or type 'done' to finish): ");
            String premiumToppingsInput = scanner.nextLine();
            if (!premiumToppingsInput.equalsIgnoreCase("done")) {
                String[] premiumToppings = premiumToppingsInput.split(",");
                for (String topping : premiumToppings) {
                    sandwich.PremiumTopping(topping.trim());
                }
            }

            System.out.println("Toast the sandwich? (Y/N): ");
            String toastInput = scanner.nextLine().toUpperCase();
            if (toastInput.equals("Y")) {
                sandwich.setToasted(true);
            }

            order.Sandwich(sandwich);
        }

        System.out.println("Add drinks (comma-separated list, or type 'none' if not): ");
        String drinksInput = scanner.nextLine();
        if (!drinksInput.equalsIgnoreCase("none")) {
            String[] drinks = drinksInput.split(",");
            for (String drink : drinks) {
                order.addDrink(drink.trim());
            }
        }

        System.out.println("Add chips (comma-separated list, or type 'none' if not): ");
        String chipsInput = scanner.nextLine();
        if (!chipsInput.equalsIgnoreCase("none")) {
            String[] chips = chipsInput.split(",");
            for (String chip : chips) {
                order.addChip(chip.trim());
            }
        }

        System.out.println("\nOrder Summary:");
        System.out.println(order.getOrderDetails());

        order.saveReceipt();
    }
}



