package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class DrivingTask implements Task {

    private String taskName;
    private final String where;
    private final String using;
    private List<String> executedTaskList;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
