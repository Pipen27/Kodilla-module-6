package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Order order) {


        System.out.println("Hello " + user.getName() + user.getSurname());
        System.out.println("Your order number has number: " + order.getOrderNr());
        System.out.println("We received your payment." + "\n" + "Your order is ready and will be shipped tomorrow."
                + "\n" + "Thank You for choosing our shop!" + "\n");
        }
    }

