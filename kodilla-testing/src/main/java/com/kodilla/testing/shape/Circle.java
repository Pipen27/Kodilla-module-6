package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String name;
    private double r;
    private final double PI = 3.14;
    private double field = PI * r*r;

    public Circle (String name, double r) {
        this.name = name;
        this.r = r;

    }

    public String getName() {
        return name;
    }

    public double getR() {
        return r;
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
        Circle circle = (Circle) o;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
