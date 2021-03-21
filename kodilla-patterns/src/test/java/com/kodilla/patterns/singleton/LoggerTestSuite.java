package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger = Logger.INSTANCE;


    @Test
    void testGetLastLog() {
        //Given
        logger.log("Test1");
        logger.log("test2");
        //When
        String lastLogTest = logger.getLastLog();
        System.out.println("Last log: " + lastLogTest);
        //Then
        assertEquals("test2", lastLogTest);
    }
}
