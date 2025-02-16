package com.junit.basic.testingExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlerTest {

    @Test
    void testValidDivision() {
        assertEquals(5, ExceptionHandler.divide(10, 2));
        assertEquals(-5, ExceptionHandler.divide(-10, 2));
        assertEquals(0, ExceptionHandler.divide(0, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionHandler.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}