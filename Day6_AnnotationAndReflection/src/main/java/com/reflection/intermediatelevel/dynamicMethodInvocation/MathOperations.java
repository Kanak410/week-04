package com.reflection.intermediatelevel.dynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOpera {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class MathOperations {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Take user input for method name
            System.out.print("Enter method (add, subtract, multiply): ");
            String methodName = sc.nextLine();

            // Take input numbers
            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();

            // Get Class object of MathOpera
            Class<?> mathClass = MathOpera.class;

            // Create an instance of MathOpera dynamically
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Get the method based on user input
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(mathInstance, n1, n2);

            // Print the result
            System.out.println("Result: " + result);

            sc.close();
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Method not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
