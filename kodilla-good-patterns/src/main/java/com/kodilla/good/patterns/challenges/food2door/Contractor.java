package com.kodilla.good.patterns.challenges.food2door;

public class Contractor {

    private String shopName;
    private String address;

    public Contractor(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }

    public String getShopName() {
        return shopName;
    }

    public String getAddress() {
        return address;
    }
}
