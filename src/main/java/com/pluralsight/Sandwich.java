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
