package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public int quantity;

    public ShoppingCart(int quantity) {
        this.quantity = quantity;
    }

    public List<ProductDescriber> cartList = new ArrayList<>();

    public void addProductToCart ( int quantity) {

        cartList.add();
    }

    public double sumValueOfCart () {

        double sum = cartList.stream()
                .map(x -> x.getPrice())
                .flatMap()
                .map(x -> x * quantity)
                .count();

        return sum;
    }
}
