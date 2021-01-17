package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create odd with empty main List, " +
            "then use isEmpty method should return true"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator odd = new OddNumbersExterminator();
        Boolean expectedResult = true;
        //When
        Boolean empty = odd.isEmpty();

        //Then
        Assertions.assertEquals(expectedResult, empty);
    }



    @DisplayName("when create odd, " +
            "then exterminate should return only odd numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator odd = new OddNumbersExterminator();
        Boolean expectedResult = true;
        Boolean testResult;
        testResult = true;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        //When
        List<Integer> odds = odd.exterminate(numbers);

        {for(int oddsNr : odds)
            if (oddsNr % 2 == 0) {
                testResult = true;
               }

             else {
                testResult = false;
            }
        }


        //Then
        Assertions.assertEquals(expectedResult, testResult);
    }
}

