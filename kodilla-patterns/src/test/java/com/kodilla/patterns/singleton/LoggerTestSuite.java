package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger = Logger.INSTANCE;


    @Test
    void testGetLastLog() {
        //Given
        Logger.INSTANCE.log("Test1");
        Logger.INSTANCE.log("test2");
        Logger.INSTANCE.log("Test2");
        //When
        String lastLogTest = Logger.INSTANCE.getLastLog();
        System.out.println("Last log: " + lastLogTest);
        //Then
        assertEquals("Test2", lastLogTest);
    }
}
