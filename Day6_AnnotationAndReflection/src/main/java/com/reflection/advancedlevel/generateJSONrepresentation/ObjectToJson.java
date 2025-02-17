package com.reflection.advancedlevel.generateJSONrepresentation;

import java.lang.reflect.Field;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ObjectToJson {
    public static String toJson(Object obj) {
        // Start the JSON string
        StringBuilder json = new StringBuilder("{");

        // Get the class of the object
        Class<?> objClass = obj.getClass();

        // Get all declared fields (including private fields)
        Field[] fields = objClass.getDeclaredFields();

        // Iterate over all fields and retrieve their names and values
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);  // Access private fields

            try {
                // Get field name and value
                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                // Append field to the JSON string
                json.append("\"").append(fieldName).append("\": \"").append(fieldValue).append("\"");

                // Add comma between fields if it's not the last field
                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Close the JSON string
        json.append("}");

        // Return the JSON-like string
        return json.toString();
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("arti", 30);

        // Convert the object to a JSON-like string
        String jsonString = toJson(person);

        // Print the JSON-like string
        System.out.println("JSON-like Representation: " + jsonString);
    }
}


