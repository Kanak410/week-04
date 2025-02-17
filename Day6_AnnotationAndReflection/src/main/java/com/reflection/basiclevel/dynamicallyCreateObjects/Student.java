package com.reflection.basiclevel.dynamicallyCreateObjects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

 class Studentl {
    private String name;

    public Studentl() {
        this.name = "kanak rajput";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Student {
    public static void main(String[] args) {
        try {
            // Get the Class object for Student
            Class<?> studentlClass = Class.forName("com.reflection.basiclevel.dynamicallyCreateObjects.Studentl");

            // Get the constructor (no-arg constructor in this case)
            Constructor<?> constructor = studentlClass.getDeclaredConstructor();


            Object studentlInstance = constructor.newInstance();

            // Invoke a method using reflection (optional)
            Method displayMethod = studentlClass.getMethod("display");
            displayMethod.invoke(studentlInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
