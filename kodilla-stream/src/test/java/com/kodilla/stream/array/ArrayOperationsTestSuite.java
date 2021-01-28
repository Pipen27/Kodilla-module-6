package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test

    void ArrayOperationsTestSuite (){

        //Given
        int[] testArray = new int[20];
        for (int i = 0; i < 20; i++)
            testArray[i] = i + 1;



        //When

        double testedResult = ArrayOperations.getAverage(testArray);

        //Then

        Assertions.assertEquals(10.5,testedResult);
    }

}
