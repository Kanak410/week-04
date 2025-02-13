package org.example.readUserinputfromConsole;
import java.io.*;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your favorite programming language: ");
        String language = scanner.nextLine();

        String fileName = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\readUserinputfromConsole\\user";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("User information saved successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }


    }
}
