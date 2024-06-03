package com.pluralsight;

import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void displayHomeScreen() {
        while (true) {
            System.out.println("Welcome to Tasty Subs!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    break;
                case 0:
                    System.out.println("Thank you for using Sandwich Ordering System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayOrderScreen() {
        while (true) {
            System.out.println("\nOrder Screen:");
            System.out.println("1)  Sandwich");
            System.out.println("2)  Drink");
            System.out.println("3)  Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    cancelOrder();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addSandwich() {
        System.out.println("\nAdd Sandwich:");
        System.out.println("Select your bread: (white, wheat, rye, wrap)");
        String breadType = scanner.nextLine();
        System.out.println("Sandwich size: (4\", 8\", 12\")");
        String size = scanner.nextLine();

        Sandwich sandwich = new Sandwich(size, breadType);

        System.out.println("Toppings:");
        System.out.println("Meat:");
        String meat = scanner.nextLine();
        sandwich.PremiumToppings(meat);
        System.out.println("Cheese:");
        String cheese = scanner.nextLine();
        sandwich.addPremiumToppings(cheese);
        System.out.println("Other toppings:");
        String otherToppings = scanner.nextLine();
        String[] otherToppingsArray = otherToppings.split(",");
        for (String topping : otherToppingsArray) {
            sandwich.addRegularToppings(topping.trim());
        }

        System.out.println("Select sauces:");
        String sauces = scanner.nextLine();
        String[] saucesArray = sauces.split(",");
        for (String sauce : saucesArray) {
            sandwich.addRegularTopping(sauce.trim());
        }

        System.out.println("Would you like the sandwich toasted? (Y/N)");
        String toastedInput = scanner.nextLine();
        if (toastedInput.equalsIgnoreCase("Y")) {
            sandwich.setToasted(true);
        }


    }

    private void addDrink() {
        System.out.println("\nAdd Drink:");
        System.out.println("Select drink size: (small, medium, large)");
        String size = scanner.nextLine();
        System.out.println("Select drink flavor:");
        String flavor = scanner.nextLine();
        System.out.println("Drink added to the order.");
    }

    private void addChips() {
        System.out.println("\nAdd Chips:");
        System.out.println("Select chip type:");
        String chipType = scanner.nextLine();
        System.out.println("Chips added to the order.");
    }

    private void checkout() {
        System.out.println("\nCheckout:");
        System.out.println("1) Confirm");
        System.out.println("0) Cancel");
        System.out.print("Please select an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Order confirmed. Receipt saved.");
                displayHomeScreen();
                break;
            case 0:
                System.out.println("Order canceled.");
                displayHomeScreen();
                break;
            default:
                System.out.println("Invalid choice. Returning to order screen.");
                break;
        }
    }

    private void cancelOrder() {
        System.out.println("Order canceled.");
        displayHomeScreen();
    }