package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {

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

}
