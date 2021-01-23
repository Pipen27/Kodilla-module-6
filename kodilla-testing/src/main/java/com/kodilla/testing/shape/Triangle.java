package com.kodilla.testing.shape;

import java.util.Objects;

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

    public String getShapeName () {
       return name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

