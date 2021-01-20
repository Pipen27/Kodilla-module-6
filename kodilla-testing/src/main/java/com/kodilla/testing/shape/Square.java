package com.kodilla.testing.shape;

public class Square implements Shape {


    private String name;
    private double c;
    private double field = c*c;

    public Square (String name, double c) {
        this.name = name;
        this.c = c;

    }

    public String getName() {
        return name;
    }

    public double getC() {
        return c;
    }



    public double getField (double field) {
        return field;
    }

    public String getShapeName () {
        return name;

    }
}
