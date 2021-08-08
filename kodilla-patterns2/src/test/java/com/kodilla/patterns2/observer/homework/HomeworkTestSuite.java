package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTestSuite {

    @Test
    void testUpdate() {
        //Given
        Mentor johnSmith = new Mentor("John Smith");
        Mentor alanClarkson = new Mentor("Alan Clarkson");
        Mentor tonySoprano = new Mentor("Tony Soprano");

        Homework module1 = new Module1();
        Homework module2 = new Module2();
        Homework module3 = new Module3();

        module1.registerObserver(tonySoprano);
        module2.registerObserver(tonySoprano);
        module3.registerObserver(tonySoprano);
        module1.registerObserver(johnSmith);
        module2.registerObserver(johnSmith);
        module2.registerObserver(alanClarkson);
        module3.registerObserver(alanClarkson);


        //When
        module1.addTask("Controller task");
        module1.addTask("Testing controller using Postman");
        module1.addTask("Rest template task");
        module2.addTask("For loop task");
        module2.addTask("While loop task");
        module3.addTask("Array List task");
        module3.addTask("Hash Set task");


        //Then
        assertEquals(5, johnSmith.getUpdateCount());
        assertEquals(4, alanClarkson.getUpdateCount());
        assertEquals(7, tonySoprano.getUpdateCount());
    }

}