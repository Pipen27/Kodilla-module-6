package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double a;
    private double h;
    private double field = (a*h)/2;

    public Triangle(String name, double a, double h) {
        this.name = name;
        this.a = a;
        this.h = h;

    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public double getField (double field) {
        return field;
    }

    public String getShapeName (String name) {
       return name;

    }


}

