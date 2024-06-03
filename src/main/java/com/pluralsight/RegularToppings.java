package com.pluralsight;

    class regularToppings extends Topping {

        public regularToppings(String name) {
            super(name);
        }

        @Override
        public double getCost() {
            return 0;
        }
    }

