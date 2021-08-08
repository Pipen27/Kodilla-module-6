package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {

    private final List<Observer> homeWorkObservers;
    private final ArrayDeque<String> homeworkTasks;
    private final String name;

    public Homework(String name) {
        homeWorkObservers = new ArrayList<>();
        homeworkTasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        homeworkTasks.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        homeWorkObservers.add(observer);

    }

    @Override
    public void notifyObservers() {

        for (Observer observer : homeWorkObservers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        homeWorkObservers.remove(observer);

    }

    public ArrayDeque<String> getHomeworkTasks() {
        return homeworkTasks;
    }

    public String getName() {
        return name;
    }

}
