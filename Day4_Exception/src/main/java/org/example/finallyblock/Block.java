package org.example.finallyblock;

import java.util.Scanner;

public class Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
