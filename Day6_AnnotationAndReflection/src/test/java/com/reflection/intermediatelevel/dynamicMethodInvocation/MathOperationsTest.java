package com.reflection.intermediatelevel.dynamicMethodInvocation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

class MathOperationsTest {

    @Test
    void testAddMethod() {
        try {
            // Instantiate MathOpera class dynamically
            Class<?> mathClass = MathOpera.class;
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Dynamically get the 'add' method
            Method addMethod = mathClass.getMethod("add", int.class, int.class);

            // Invoke the add method dynamically
            Object result = addMethod.invoke(mathInstance, 5, 3);

            // Validate the result (5 + 3 = 8)
            assertEquals(8, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test
    void testSubtractMethod() {
        try {
            // Instantiate MathOpera class dynamically
            Class<?> mathClass = MathOpera.class;
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Dynamically get the 'subtract' method
            Method subtractMethod = mathClass.getMethod("subtract", int.class, int.class);

            // Invoke the subtract method dynamically
            Object result = subtractMethod.invoke(mathInstance, 10, 4);

            // Validate the result (10 - 4 = 6)
            assertEquals(6, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test
    void testMultiplyMethod() {
        try {
            // Instantiate MathOpera class dynamically
            Class<?> mathClass = MathOpera.class;
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Dynamically get the 'multiply' method
            Method multiplyMethod = mathClass.getMethod("multiply", int.class, int.class);

            // Invoke the multiply method dynamically
            Object result = multiplyMethod.invoke(mathInstance, 6, 7);

            // Validate the result (6 * 7 = 42)
            assertEquals(42, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }


    
}