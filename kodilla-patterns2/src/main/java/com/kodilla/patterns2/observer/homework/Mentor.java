package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(name + ": Your student has sent you a new homework: \"" + homework.getName() +
                " - " + homework.getHomeworkTasks().getLast() + "\" to check. \nTotal homeworks to check: " + homework.getHomeworkTasks().size());
        updateCount++;

    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

