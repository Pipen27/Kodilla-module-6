package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChalengeTestSuite {

    @Test
    void testprobablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then


        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9,0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.1,1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1, 4))
        );
    }

    @Test
    void testExceptionHandling() {

        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        ExceptionHandling exceptionHandling = new ExceptionHandling(secondChallenge);
        // when & then


        assertAll(
                () -> assertThrows(Exception.class, () -> exceptionHandling.exceptionHandling(2,0)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.exceptionHandling(0.9,0)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.exceptionHandling(1.1,1.5)),
                () -> assertDoesNotThrow(() -> exceptionHandling.exceptionHandling(1.1, 4))
        );
    }
}

