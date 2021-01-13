package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(7,7);

        int resultAdd = calculator.add();
        if (resultAdd > 10) {
            System.out.println("The count is greater than 10");
        } else {
            System.out.println("The count is smaller or equal to 10!");
        }

        int resultSub = calculator.substract();
        if (resultSub > 0) {
            System.out.println("The count is positive");
        } else if (resultSub == 0) {
            System.out.println("The count is  equal to 0");
        } else {
            System.out.println("The count is negative");
        }
    }
}
