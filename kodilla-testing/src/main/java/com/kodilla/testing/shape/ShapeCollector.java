package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<String> shapes = new ArrayList<>();

    public String addFigure (Shape shape){
        return shape.getShapeName("Circle") +
                shapes.add(shape.getShapeName("Circle"));
    }

    public boolean removeFigure (ShapeCollector shapeCollector) {
        boolean result = false;
        if (shapes.contains("Circle")) {
            shapes.remove("Circle");
            result = true;
        }
        return result;
    }

    public String getFigure (int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }

    public List<String> showFigures () {
        if (shapes.size() > 0){
            return shapes;
        }
        return shapes;
    }


    public int getShapesQuantity() {
        return shapes.size();
    }




    }
