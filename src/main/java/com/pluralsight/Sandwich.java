package com.pluralsight;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sandwich {

    private String size;
    private String breadType;
    private ArrayList<String> regularToppings;
    private ArrayList<String> premiumToppings;
    private boolean toasted;

    public Sandwich(String size, String breadType) {
        this.size = size;
        this.breadType = breadType;
        regularToppings = new ArrayList<>();
        premiumToppings = new ArrayList<>();
        toasted = false;
    }

    public void addRegularTopping(String topping) {
        regularToppings.add(topping);
    }

    public void addPremiumTopping(String topping) {
        premiumToppings.add(topping);
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public double calculateCost() {
        double cost = 0;
        if (size.equals("4\"")) {
            cost += 3.50;
        } else if (size.equals("8\"")) {
            cost += 5.50;
        } else if (size.equals("12\"")) {
            cost += 7.50;
        }

        cost += regularToppings.size() * 0.50;
        cost += premiumToppings.size() * 1.00;

        return cost;
    }
    }
private void Sandwich() {
    System.out.println("\nAdd Sandwich:");
    System.out.println("Select your bread: (white, wheat, rye, wrap)");
    Scanner scanner;
    String breadType = Scanner.nextLine();
    System.out.println("Sandwich size: (4\", 8\", 12\")");
    String size = Scanner.nextLine();

    Sandwich sandwich = new Sandwich(size, breadType);

    System.out.println("Toppings:");
    System.out.println("Meat:");
    String meat = scanner.nextLine();
    sandwich.addPremiumTopping(meat);
    System.out.println("Cheese:");
    String cheese = scanner.nextLine();
    sandwich.addPremiumTopping(cheese);
    System.out.println("Other toppings:");
    String otherToppings = scanner.nextLine();
    String[] otherToppingsArray = otherToppings.split(",");
    for (String topping : otherToppingsArray) {
        sandwich.addRegularTopping(topping.trim());
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