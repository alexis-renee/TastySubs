package com.pluralsight;


import java.util.ArrayList;
import java.util.List;


public class Sandwich {

    private String bread;
    private String size;
    private boolean toasted;
    private List<String> otherToppings;
    private List<String> extras;

    public Sandwich() {
        otherToppings = new ArrayList<>();
        extras = new ArrayList<>();
        toasted = false;
    }
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

public String getOrderDetails() {
    StringBuilder details = new StringBuilder();
    details.append("Size: ").append(size).append("\n");
    details.append("Bread Type: ").append(breadType).append("\n");
    details.append("Regular Toppings: ").append(regularToppings).append("\n");
    details.append("Premium Toppings: ").append(premiumToppings).append("\n");
    details.append("Toasted: ").append(toasted).append("\n");
    details.append("Cost: $").append(calculateCost()).append("\n");
    return details.toString();
}
}

class Order {
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<String> drinks;
    private ArrayList<String> chips;

    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(String drink) {
        drinks.add(drink);
    }

    public void addChip(String chip) {
        chips.add(chip);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Sandwich sandwich : sandwiches) {
            totalCost += sandwich.calculateCost();
        }
        totalCost += drinks.size() * 1.50; // Assuming $1.50 per drink
        totalCost += chips.size() * 1.00; // Assuming $1.00 per chip
        return totalCost;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Sandwiches:\n");
        for (Sandwich sandwich : sandwiches) {
            details.append(sandwich.getOrderDetails()).append("\n");
        }
        details.append("Drinks: ").append(drinks).append("\n");
        details.append("Chips: ").append(chips).append("\n");
        details.append("Total Cost: $").append(calculateTotalCost()).append("\n");
        return details.toString();