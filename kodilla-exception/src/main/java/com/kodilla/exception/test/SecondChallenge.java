package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {


        try {
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new ExceptionHandling();
            }}catch (ExceptionHandling exceptionHandling){
            throw new ExceptionHandling();

        }finally {
            System.out.println("Set x greater than 1 and smaller or equals 2 or set y different from 1.5"  );
        }
            return "Done!";
        }
    }

