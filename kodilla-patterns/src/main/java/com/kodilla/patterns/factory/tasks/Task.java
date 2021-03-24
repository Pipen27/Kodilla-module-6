package com.kodilla.patterns.factory.tasks;

public interface Task {

    void executeTask(String taskName);
    String getTaskName();
    boolean isTaskExecuted();
}
