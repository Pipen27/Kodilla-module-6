package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderTime;
    private Product orderedProduct;
    private Order order;

    public OrderRequest(User user, LocalDateTime orderTime, Product orderedProduct, Order order) {
        this.user = user;
        this.orderTime = orderTime;
        this.orderedProduct = orderedProduct;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public Order getOrder()
    {
        return order;
    }
}
