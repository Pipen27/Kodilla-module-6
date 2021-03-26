package com.kodilla.patterns.builder.bigmac;

public enum Burgers {

    ONE(1),
    TWO(2),
    THREE(3);

    private int numberOfBurgers;

    Burgers(int numberOfBurgers) {
        this.numberOfBurgers = numberOfBurgers;
    }

    public int getNumberOfBurgers(Burgers quantity) {
        return numberOfBurgers;
    }
}
