package com.reflection.intermediatelevel.retrieveannotationsatRuntime;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnnotationExampleTest {

    @Test
    void testAuthorAnnotation() {
        // Get the class object of MyClass
        Class<?> clazz = MyClass.class;

        // Check if the @Author annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {
            // Retrieve the @Author annotation
            Author author = clazz.getAnnotation(Author.class);

            // Assert that the author's name is "kanak rajput"
            assertEquals("kanak rajput", author.name(), "The author name should be 'kanak rajput'.");
        } else {
            fail("The class MyClass is not annotated with @Author.");
        }
    }

    @Test
    void testClassWithoutAuthorAnnotation() {
        // Create a dummy class without the @Author annotation
        class AnotherClass {
            // Some code
        }

        // Get the class object of AnotherClass
        Class<?> clazz = AnotherClass.class;

        // Assert that @Author annotation is not present
        assertFalse(clazz.isAnnotationPresent(Author.class), "The class AnotherClass should not be annotated with @Author.");
    }
}