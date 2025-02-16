package com.junit.basic.testingParameterizedTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 100, 202})
    void testEvenNumbers(int number) {
        assertTrue(EvenNumberChecker.isEven(number), number + " should be even.");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 101, 203})
    void testOddNumbers(int number) {
        assertFalse(EvenNumberChecker.isEven(number), number + " should be odd.");
    }
}