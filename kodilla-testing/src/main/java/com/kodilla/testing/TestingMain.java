package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(7,3);
        if (resultAdd == 10) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Error 1");
        }

        int resultSub = calculator.substract(100,10);
        if (resultSub == 90) {
            System.out.println("Test 2 OK");
        }  else {
            System.out.println("Error 2");
        }
    }
}
