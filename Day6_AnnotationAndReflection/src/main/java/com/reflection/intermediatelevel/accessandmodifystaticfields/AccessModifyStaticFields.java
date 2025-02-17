package com.reflection.intermediatelevel.accessAndModifyStaticFields;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "12345-Initial-API-KEY";

    public static void printApiKey() {
        System.out.println("API Key: " + API_KEY);
    }
}

public class AccessModifyStaticFields {
    public static void main(String[] args) {
        try {
            // Step 1: Get the class object for Configuration
            Class<?> configClass = Configuration.class;

            // Step 2: Access the private static field 'API_KEY'
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Step 3: Make the field accessible, as it's private
            apiKeyField.setAccessible(true);

            // Step 4: Modify the value of the static field 'API_KEY'
            apiKeyField.set(null, "67890-Modified-API-KEY");

            // Step 5: Print the modified API key using the static method
            Configuration.printApiKey();  // Should print "API Key: 67890-Modified-API-KEY"

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
