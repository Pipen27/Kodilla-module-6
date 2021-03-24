package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class ShoppingTask implements Task {

    private String taskName;
    private final  String whatToBuy;
    private final double quantity;
    private List<String> executedTaskList;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
