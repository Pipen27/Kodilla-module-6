package com.kodilla.exception.test;

public class ExceptionHandling {

    public ExceptionHandling(SecondChallenge secondChallenge) {
        this.secondChallenge = secondChallenge;
    }

    private SecondChallenge secondChallenge;


    public String exceptionHandling(double x, double y) throws Exception {
        try {
             secondChallenge.probablyIWillThrowException(x, y);

        } catch (Exception exception) {
            throw new Exception();


        } finally {
            System.out.println("Exception Handling Done");
        }
        return "Done!";

    }
}


