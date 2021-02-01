package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{


    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(0.9, 1);
        }catch (Exception exception){
            System.out.println("Incompatible counts. " +
                    "\nSet x greater than 1 and smaller or equals 2 or set y different from 1.5");

    }finally {
        System.out.println("Done"  );
    }


    }

}
