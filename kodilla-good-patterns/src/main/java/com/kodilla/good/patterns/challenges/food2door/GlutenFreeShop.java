package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements OrderRealization {

    private List<Product> productList = new ArrayList<>();
    private boolean isAvailable;
    private int index;

    public GlutenFreeShop()
    {
        Product product7 = new Product("Product7", 200);
        Product product8 = new Product("Product8", 10);
        Product product9 = new Product("Product9", 55);

        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean process(Product product, Order order) {

        for (int i = 0; i < productList.size(); i++) {
            if (product.getName().equals(productList.get(i).getName())) {
                index = i;
                isAvailable = true;
                break;
            }
        }
        if (productList.get(index).getAvailableQuantity() >= product.getAvailableQuantity() && isAvailable) {
            System.out.println(toString());
            System.out.println("We have this product in our shop with required quantity");
            System.out.println();
            return true;
        } else if (productList.get(index).getAvailableQuantity() < product.getAvailableQuantity() && isAvailable) {
            System.out.println(toString());
            System.out.println("We have this product in our shop, but with insufficient quantity" +
                    "You can order only " + product.getAvailableQuantity() + " of " + product.getName());
            System.out.println();
            return false;
        }
            System.out.println(toString());
            System.out.println("Sorry. We do not have this product in our shop");
            System.out.println();
            return false;
    }

        @Override
        public String toString() {
            return "Welcome in Gluten Free Shop";
        }

}
