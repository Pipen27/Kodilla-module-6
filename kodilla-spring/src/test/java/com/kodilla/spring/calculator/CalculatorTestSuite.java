package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given

        //When
        double result = calculator.add(100, 10);

        //Then
        assertEquals(110,result);
    }

    @Test
    void testSub() {
        //Given

        //When
        double result = calculator.sub(100, 10);

        //Then
        assertEquals(90,result);
    }

    @Test
    void testMul() {
        //Given

        //When
        double result = calculator.mul(100, 10);

        //Then
        assertEquals(1000,result);
    }

    @Test
    void testDiv() {
        //Given

        //When
        double result = calculator.div(100, 10);

        //Then
        assertEquals(10,result);
    }
}
