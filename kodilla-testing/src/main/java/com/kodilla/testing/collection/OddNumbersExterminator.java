package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    List<Integer> numbers = new ArrayList<>();

    public List<Integer> createNumbers() {

        for (int n = 0; n < 10; n++) {
            numbers.add(n);
        }

    return numbers;}

    public List<Integer> exterminate(List<Integer> numbers) {


        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer oddNumber : numbers) {
            if (oddNumber % 2 == 0) {
                oddNumbers.add(oddNumber);
            }
        }
        return oddNumbers;
    }

    public boolean isEmpty() {
        if (numbers.isEmpty()) {
            return true;
        }
    return true;}

}
