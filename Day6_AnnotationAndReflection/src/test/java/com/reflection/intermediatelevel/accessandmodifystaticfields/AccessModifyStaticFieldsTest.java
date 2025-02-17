package com.reflection.intermediatelevel.accessAndModifyStaticFields;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationTest {

    @Test
    void testModifyApiKey() throws NoSuchFieldException, IllegalAccessException {
        // Access and modify the static field using reflection
        Class<?> configClass = com.reflection.intermediatelevel.accessAndModifyStaticFields.Configuration.class;
        Field apiKeyField = configClass.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);
        apiKeyField.set(null, "Modified-API-KEY-For-Test");

        // Get the modified value of API_KEY using reflection
        String modifiedApiKey = (String) apiKeyField.get(null);

        // Assert that the API_KEY has been modified
        assertEquals("Modified-API-KEY-For-Test", modifiedApiKey, "API Key should be modified.");
    }
}
