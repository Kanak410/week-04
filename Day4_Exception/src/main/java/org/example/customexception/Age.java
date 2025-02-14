package org.example.customexception;

import java.util.Scanner;
import java.io.*;

public class Age {
    public static void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");

        }else{
            System.out.println("Acess granted!");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validate(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        }

    }
}
