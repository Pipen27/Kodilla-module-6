package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        OrderGenerator orderGenerator = new OrderGenerator();
        Order orderExtraFood = orderGenerator.retrieve();
        Order orderHealthy = orderGenerator.retrieve2();
        Order orderGluten = orderGenerator.retrieve3();

        OrderProcessor orderProcessorExtraFood = new OrderProcessor(new ExtraFoodShop(), orderExtraFood);
        OrderProcessor orderProcessorHealthy = new OrderProcessor(new HealthyShop(), orderHealthy);
        OrderProcessor orderProcessorGluten = new OrderProcessor(new GlutenFreeShop(), orderGluten);

        orderProcessorExtraFood.executeOrder();
        orderProcessorHealthy.executeOrder();
        orderProcessorGluten.executeOrder();
    }
}
