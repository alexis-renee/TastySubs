package com.pluralsight;

    abstract class Topping {
        protected String name;

        public Topping(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract double getCost();
    }
