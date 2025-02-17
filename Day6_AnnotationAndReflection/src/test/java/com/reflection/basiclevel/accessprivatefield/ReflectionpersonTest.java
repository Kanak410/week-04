package com.reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

 class Reflectionperson {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            Class<?> personClass = person.getClass();
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);

            int currentAge = (int) ageField.get(person);
            System.out.println("Current Age (via Reflection): " + currentAge);

            ageField.set(person, 30);
            System.out.println("Modified Age (via Reflection): " + ageField.get(person));

            person.displayAge();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

// JUnit test class should be in a separate file, but kept here for simplicity
class ReflectionPersonTest {
    @Test
    void testReflectionAccess() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person(25);
        Class<?> personClass = person.getClass();
        Field ageField = personClass.getDeclaredField("age");
        ageField.setAccessible(true);

        assertEquals(25, ageField.get(person));

        ageField.set(person, 30);
        assertEquals(30, ageField.get(person));
    }
}
