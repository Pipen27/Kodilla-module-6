package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements OrderRealization {

    private List<Product> productList = new ArrayList<>();
    private int index;
    private boolean isAvailable;


    public ExtraFoodShop()
    {
        Product product1 = new Product("Product1", 50);
        Product product2 = new Product("Product2", 80);
        Product product3 = new Product("Product3", 30);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean process(Product product, Order order)
    {
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
            System.out.println("We have this product in our shop, but with insufficient quantity");
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
        return "Welcome in Extra Food Shop";
    }
}
