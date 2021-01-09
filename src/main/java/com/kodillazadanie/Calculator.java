package com.kodillazadanie;

public class Calculator {
    public void addition () {
        System.out.println("Addition done");
    }
    public void subtraction () {
        System.out.println("Subtraction done");
    }
    public static void main (String args []){
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.subtraction();
    }
}
