package com.reflection.basiclevel.invokeprivateMethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testMultiUsingReflection() {
        try {
            // Create an instance of Calculate class
            Calculate calculator = new Calculate();

            // Access the private method
            Method m = Calculate.class.getDeclaredMethod("multi", int.class, int.class);
            m.setAccessible(true); // Make it accessible

            // Invoke the method and get the result
            int result = (int) m.invoke(calculator, 5, 3);

            // Assert the expected result
            assertEquals(15, result, "Multiplication result should be 15");

        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
}