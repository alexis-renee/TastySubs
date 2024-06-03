package com.pluralsight;


   public class Drink {
        private String name;
        private double price;
        private int size;
        private String flavor;

        public Drink(String name, double price, int size, String flavor) {
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
            System.out.println("Drink Name: " + name);
            System.out.println("Price: $" + String.format("%.2f", price));
            System.out.println("Size: " + size + " oz");
            System.out.println("Flavor: " + flavor);
        }
}
