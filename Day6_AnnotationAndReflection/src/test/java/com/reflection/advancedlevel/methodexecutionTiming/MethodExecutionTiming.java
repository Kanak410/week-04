package com.reflection.advancedlevel.methodexecutionTiming;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class SampleClass {
    // Some methods to test the execution time
    public void doSomething() {
        try {
            Thread.sleep(500);  // Simulate a delay of 500 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSomethingElse() {
        try {
            Thread.sleep(1000);  // Simulate a delay of 1000 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MethodExecutionTiming {

    // This method should be public and return a Map
    public Map<String, Long> measureExecutionTime(Object obj) {
        Map<String, Long> executionTimes = new HashMap<>();

        try {
            // Get the class object
            Class<?> clazz = obj.getClass();

            // Get all methods in the class
            Method[] methods = clazz.getDeclaredMethods();

            // Loop through each method and measure its execution time
            for (Method method : methods) {
                // Start the timer
                long startTime = System.nanoTime();

                // Invoke the method using reflection
                method.setAccessible(true);  // Make the method accessible if private
                method.invoke(obj);  // Invoke the method

                // End the timer
                long endTime = System.nanoTime();

                // Calculate the time taken to execute the method
                long duration = endTime - startTime;
                executionTimes.put(method.getName(), duration);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return executionTimes;
    }
}
