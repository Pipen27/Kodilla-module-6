package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask(shopping.getTaskName());
        boolean result = shopping.isTaskExecuted();
        //Then
        assertEquals("do shopping", shopping.getTaskName());
        assertEquals(true, result);
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask(painting.getTaskName());
        boolean result = painting.isTaskExecuted();
        //Then
        assertEquals("renovate bedroom", painting.getTaskName());
        assertEquals(true, result);
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask(driving.getTaskName());
        boolean result = driving.isTaskExecuted();
        //Then
        assertEquals("make a trip", driving.getTaskName());
        assertEquals(true, result);
    }
}
