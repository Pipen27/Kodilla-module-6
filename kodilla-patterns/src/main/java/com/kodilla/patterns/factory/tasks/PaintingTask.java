package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task {

    private String taskName;
    private final String color;
    private final String whatToPaint;
    private List<String> executedTaskList;


    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask(String taskName) {
        this.taskName = taskName;

        executedTaskList = new ArrayList<>();
        executedTaskList.add(taskName);

        System.out.println("Task " + taskName + " is executed.");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executedTaskList.contains(taskName)) {
            return true;
        }
        return false;
    }
}
