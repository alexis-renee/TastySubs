package com.pluralsight;


import java.util.ArrayList;

public class Order {
    private ArrayList<String> sandwiches;
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

    public void addDrink (String drink) {
        drinks.add(drink);
    }

    public void addChip(String chip) {
        chips.add(chip);
    }

    public double calculateTotalCost() {
        double totalCost = sandwiches.stream().
        totalCost += drinks.size() * 1.50;
        totalCost += chips.size() * 1.00;
        return totalCost;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Sandwiches:\n");
        sandwiches.forEach(s -> details.append(s.getOrderDetails()).append("\n"));
        details.append("Drinks: ").append(drinks).append("\n");
        details.append("Chips: ").append(chips).append("\n");
        details.append("Total Cost: $").append(String.format("%.2f", calculateTotalCost())).append("\n");
        return details.toString();
    }

    public void saveReceipt() {
        String timeStamp = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss").format(LocalDateTime.now());
        String fileName = "receipts/" + timeStamp + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(getOrderDetails());
            System.out.println("Receipt saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt.");
            e.printStackTrace();
        }
    }
}
            }