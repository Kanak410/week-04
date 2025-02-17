package com.reflection.basiclevel.dynamicallyCreateObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
class StudentTest {

    @Test
    void testStudentlDynamicCreation() {
        try {
            // Load the Studentl class dynamically
            Class<?> studentlClass = Class.forName("com.reflection.basiclevel.dynamicallyCreateObjects.Studentl");

            // Get the no-argument constructor
            Constructor<?> constructor = studentlClass.getDeclaredConstructor();

            // Create an instance dynamically
            Object studentlInstance = constructor.newInstance();

            // Invoke the display method using reflection
            Method displayMethod = studentlClass.getMethod("display");
            displayMethod.invoke(studentlInstance);

            // Verify the class type
            assertNotNull(studentlInstance, "Object should be created successfully");
            assertEquals("com.reflection.basiclevel.dynamicallyCreateObjects.Studentl", studentlInstance.getClass().getName(), "Class name should match");

        } catch (Exception e) {
            fail("Reflection test failed: " + e.getMessage());
        }
    }

}