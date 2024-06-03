package com.pluralsight;


class premiumTopping extends Topping {
    public premiumTopping(String name) {
        super(name);
    }

    @Override
    public double getCost() {
        return 1.50;
    }
}
