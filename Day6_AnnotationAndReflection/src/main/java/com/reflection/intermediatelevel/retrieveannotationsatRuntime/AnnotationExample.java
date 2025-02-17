package com.reflection.intermediatelevel.retrieveannotationsatRuntime;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

// Step 1: Define the custom @Author annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();  // Element for the author's name
}

// Step 2: Apply the @Author annotation to a class
@Author(name = "kanak rajput")
class MyClass {
    // Some class code
    public void display() {
        System.out.println("This is MyClass.");
    }
}

// Step 3: Retrieve and display the annotation value at runtime using Reflection
public class AnnotationExample {
    public static void main(String[] args) {
        try {
            // Get the class object of MyClass
            Class<?> clazz = MyClass.class;

            // Check if the @Author annotation is present
            if (clazz.isAnnotationPresent(Author.class)) {
                // Retrieve the @Author annotation
                Author author = clazz.getAnnotation(Author.class);

                // Display the value of the name attribute in the annotation
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("The class is not annotated with @Author.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

