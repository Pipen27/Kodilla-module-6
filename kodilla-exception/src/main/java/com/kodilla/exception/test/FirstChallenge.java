package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {


       if (b == 0){
            throw new ArithmeticException();
        }

        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch(ArithmeticException arithmeticException){
            System.out.println("You can't divide by 0");
        }finally {
            System.out.println("As \"b\" you can insert all double numbers without 0");
        }



    }
}