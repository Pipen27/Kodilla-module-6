package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve()
    {
        User user = new User("John", "Rambo");
        LocalDateTime orderTime = LocalDateTime.now();
        Product orderedProduct = new Product("Weapons", "Machine gun", "AK47", 1147, 2);
        Order order = new Order(orderTime.getYear() + 10000 + orderTime.getMonthValue() + orderTime.getDayOfMonth());

        return new OrderRequest(user, orderTime, orderedProduct, order);
    }
}
