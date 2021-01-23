package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
