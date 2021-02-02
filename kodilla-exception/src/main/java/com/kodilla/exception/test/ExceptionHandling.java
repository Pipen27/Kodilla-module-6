package com.kodilla.exception.test;

public class ExceptionHandling {

    private SecondChallenge secondChallenge;


    public String exceptionHandling() {
        try {
            return secondChallenge.probablyIWillThrowException(1, 1);
        } catch (Exception exception) {
            System.out.println("Incompatible counts. " +
                    "\nSet x greater than 1 and smaller or equals 2 or set y different from 1.5");

        } finally {
            System.out.println("Done");
        }
        return "Done!";

    }
}


