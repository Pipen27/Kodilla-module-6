package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String name;
    private int availableQuantity;

    public Product(String name, int availableQuantity) {
        this.name = name;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}
