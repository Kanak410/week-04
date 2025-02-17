package com.reflection.advancedlevel.dependencyinjectionusingreflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    // Register the class and create an instance of it
    public <T> void register(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            instances.put(clazz, instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Resolve dependencies and inject them into the object
    public <T> T resolve(Class<T> clazz) {
        try {
            // If the instance of the class already exists, return it
            T instance = (T) instances.get(clazz);
            if (instance == null) {
                // Create a new instance if not already created
                instance = clazz.getDeclaredConstructor().newInstance();
                instances.put(clazz, instance);
            }

            // Inject dependencies using Reflection
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    // Get the dependency type (e.g., Service.class)
                    Object dependency = instances.get(field.getType());
                    if (dependency == null) {
                        // If dependency doesn't exist, resolve it recursively
                        dependency = resolve(field.getType());
                        instances.put(field.getType(), dependency);
                    }

                    // Inject the dependency
                    field.setAccessible(true);  // Ensure private fields can be accessed
                    field.set(instance, dependency);
                }
            }

            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
