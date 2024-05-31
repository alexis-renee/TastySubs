package com.pluralsight;

public class Drinks {
    private String name;
    private double price;
    private int size;
    private String flavor;

    public Drinks(String name, double price, int size, String flavor) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }
    public void display() {
        System.out.println("Drink Details");
        System.out.println("name:" + getName());
        System.out.println("price:" + getPrice());
        System.out.println("size:" + getSize());
        System.out.println("flavor:" + getFlavor());

    }
    }