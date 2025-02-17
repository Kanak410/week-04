package com.reflection.advancedlevel.methodexecutionTiming;
import java.lang.reflect.Method;

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
    public static void main(String[] args) {
        try {
            // Create an instance of the class
            SampleClass sampleClass = new SampleClass();

            // Get the class object
            Class<?> clazz = sampleClass.getClass();

            // Get all methods in the class
            Method[] methods = clazz.getDeclaredMethods();

            // Loop through each method and measure its execution time
            for (Method method : methods) {
                // Print the method name
                System.out.println("Measuring execution time for method: " + method.getName());

                // Start the timer
                long startTime = System.nanoTime();

                // Invoke the method using reflection
                method.setAccessible(true);  // Make the method accessible if private
                method.invoke(sampleClass);  // Invoke the method

                // End the timer
                long endTime = System.nanoTime();

                // Calculate the time taken to execute the method
                long duration = endTime - startTime;
                System.out.println("Execution time for " + method.getName() + ": " + duration + " nanoseconds\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

