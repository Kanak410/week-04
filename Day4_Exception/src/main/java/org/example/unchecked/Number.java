package org.example.unchecked;
import java.util.*;
import java.io.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter no: ");
            double n=sc.nextInt();
            System.out.println("enter second no:" );
            double n1= sc.nextInt();
            double res=n/n1;
            System.out.println("result"+res);

        } catch (ArithmeticException e) {
            System.out.println("zero is not allowed as second no:");

        }
        catch (InputMismatchException e) {
            System.out.println(" user enters a non-numeric value0:");

        }
    }
}
