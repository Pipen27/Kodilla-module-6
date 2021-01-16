package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    List<Integer> numbers = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
        numbers.add(n);
    }


    public List<Integer> exterminate (){

        if(numbers.isEmpty()) {
            return empty;}



        List <Integer> oddNumbers = new ArrayList<>();

        for (Integer oddNumber : numbers){
            if (oddNumber % 2 == 0) {
                oddNumbers.add(oddNumber);
            }
        }
        return oddNumbers;
    }


}
