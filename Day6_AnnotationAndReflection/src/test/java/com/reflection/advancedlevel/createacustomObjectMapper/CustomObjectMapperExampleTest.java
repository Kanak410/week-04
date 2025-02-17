package com.reflection.advancedlevel.createacustomObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomObjectMapperTest {

   

    // Test for type mismatch (e.g., passing a String for an integer field)
    @Test
    void testTypeMismatch() {
        // Sample Map with type mismatch (passing a String for age)
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", "Not a number"  // This should be an integer, but we provide a String
        );

        // Map the properties to a Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        // Validate that the Person object has been populated correctly
        assertNotNull(person, "Person object should not be null");
        assertEquals("John Doe", person.getName(), "Name should be 'John Doe'");
        assertEquals(0, person.getAge(), "Age should default to 0 (or handle as needed for error case)");
    }
}