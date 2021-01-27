package com.kodilla.stream.array;


import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {





              return      IntStream.range(0, numbers.length)


                .map(n -> numbers[n])
                .forEach(System.out::println);

                 IntStream.range(0, numbers.length)
                .map(n -> numbers[n])

                .average(numbers);
    }
}












