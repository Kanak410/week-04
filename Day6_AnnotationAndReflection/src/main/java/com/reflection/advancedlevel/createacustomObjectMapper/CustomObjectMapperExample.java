package com.reflection.advancedlevel.createacustomObjectMapper;
import java.lang.reflect.Field;
import java.util.Map;

class CustomObjectMapper {

    // Method to map Map<String, Object> to an Object of class T using Reflection
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create an instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate over the fields in the class
            for (Field field : clazz.getDeclaredFields()) {
                // Check if the field name exists in the properties map
                if (properties.containsKey(field.getName())) {
                    field.setAccessible(true); // Allow access to private fields

                    // Get the value from the map and set it to the field
                    Object value = properties.get(field.getName());

                    // Set the field value based on the field type
                    if (field.getType().isAssignableFrom(value.getClass())) {
                        field.set(instance, value);
                    } else {
                        System.out.println("Type mismatch for field: " + field.getName());
                    }
                }
            }

            // Return the populated object
            return instance;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

class Person {
    private String name;
    private int age;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CustomObjectMapperExample {
    public static void main(String[] args) {
        // Sample Map to simulate data
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30
        );

        // Use CustomObjectMapper to map Map to a Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        // Display the mapped object
        if (person != null) {
            person.display(); // Should print: Name: John Doe, Age: 30
        }
    }
}
