package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("do shopping", "new shoes", 1);
            case PAINTING:
                return new PaintingTask("renovate bedroom", "white", "walls and ceiling");
            case DRIVING:
                return new DrivingTask("make a trip", "to the lake", "by bike");
            default:
                return null;
        }

    }
}
