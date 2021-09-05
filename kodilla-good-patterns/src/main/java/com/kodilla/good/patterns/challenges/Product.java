package com.kodilla.good.patterns.challenges;

public class Product {
    private String productType;
    private String mark;
    private String productName;
    private int productId;
    private int quantity;

    public Product(String productType, String mark, String productName, int productId, int quantity) {
        this.productType = productType;
        this.mark = mark;
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductType() {
        return productType;
    }

    public String getMark() {
        return mark;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
