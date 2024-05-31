package com.pluralsight;


import java.util.ArrayList;
import java.util.List;


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

