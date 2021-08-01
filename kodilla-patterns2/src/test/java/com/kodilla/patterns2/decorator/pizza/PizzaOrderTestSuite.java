package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithHamAndExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);

        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testBasicPizzaWithHamAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);

        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + ham + extra cheese", description);
    }

    @Test
    public void testBasicPizzaWithChilliAndHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChilliDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);


        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testVipPizzaWithChildSeatExpressGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChilliDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + chilli + ham", description);
    }
}