package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements OrderRealization {

    private List<Product> productList = new ArrayList<>();
    private boolean isAvailable;
    private int index;
    private int phone;

    public int getPhone(User user) {
        phone = user.getPhoneNumber();
        return phone;
    }

    public HealthyShop()
    {
        Product product4 = new Product("Product4", 100);
        Product product5 = new Product("Product5", 60);
        Product product6 = new Product("Product6", 25);

        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean process(Product product, Order order) {

        for (int i = 0; i < productList.size(); i ++)
        {
            if (product.getName().equals(productList.get(i).getName()))
            {
                index = i;
                isAvailable = true;
                break;
            }
        }
        if (productList.get(index).getAvailableQuantity() >= product.getAvailableQuantity() && isAvailable)
        {
            System.out.println(toString());
            System.out.println("We have this product in our shop with required quantity");
            System.out.println();
            return true;
        }
        else if (productList.get(index).getAvailableQuantity() < product.getAvailableQuantity() && isAvailable)
        {
            System.out.println(toString());
            System.out.println("We have this product in our shop, but with insufficient quantity" +
                    "\nWe'll send you a notification via SMS to number: " + getPhone(order.getUser()) + " when quantity of chosen product will be sufficient.");
            System.out.println();
            return false;
        }
            System.out.println(toString());
            System.out.println("Sorry. We do not have this product in our shop right now" +
                "\n We'll send you a notification via SMS to number: " + getPhone(order.getUser()) + " when product will be available again.");
            System.out.println();
        return false;
    }
    @Override
    public String toString() {
        return "Welcome in Healthy Shop";
    }
}
