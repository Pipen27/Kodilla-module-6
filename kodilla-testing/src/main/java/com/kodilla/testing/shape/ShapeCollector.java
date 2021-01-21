package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();




    @Override
    public int hashCode() {
        return Objects.hash(shapes);
    }

    public boolean addFigure (Shape shape){
        return shapes.add(shape);
    }

    public boolean removeFigure (Shape shape) {

        return  shapes.remove(shape);
    }

    public Shape getFigure (int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }


    public List<Shape> showFigures () {



        if (shapes.size() > 0){
            return shapes;
        }
        return shapes;
    }


    public int getShapesQuantity() {
        return shapes.size();
    }




    }
