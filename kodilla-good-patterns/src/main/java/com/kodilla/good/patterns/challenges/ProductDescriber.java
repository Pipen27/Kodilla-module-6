package com.kodilla.good.patterns.challenges;

public class ProductDescriber {

    private String name;
    private Double price;
    private String currency;

    public ProductDescriber(String name, Double price, String currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
