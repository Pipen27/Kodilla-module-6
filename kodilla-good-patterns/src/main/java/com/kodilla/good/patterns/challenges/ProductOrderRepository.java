package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderTime, Product orderedProduct, Order order) {

        System.out.println("Creating order for: " + user.getName() + " " + user.getSurname());
        System.out.println("Generated order number: " + order.getOrderNr());
        System.out.println("Order details: " + "\n" +
                "Order Number: " + order.getOrderNr() + "\n" +
                "Product Type: " + orderedProduct.getProductType() + "\n" +
                "Product Mark: " + orderedProduct.getMark() + "\n" +
                "Product Name: " + orderedProduct.getProductName() + "\n" +
                "Product ID: " + orderedProduct.getProductId() + "\n" +
                "Quantity: " + orderedProduct.getQuantity());

        return true;
    }
}
