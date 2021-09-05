package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private User user;
    private Contractor contractor;
    private Product product;
    private int orderNr;

    public Order(User user, Contractor contractor, Product product, int orderNr) {
        this.user = user;
        this.contractor = contractor;
        this.product = product;
        this.orderNr = orderNr;
    }

    public User getUser() {
        return user;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderNr() {
        return orderNr;
    }
}
