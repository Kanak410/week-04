package com.regex.basic.licenseplateNumber;

import java.util.Scanner;
import java.util.regex.*;
public class Number {
    public static boolean licence(String number){
        String regex="^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex,number);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        String number=sc.nextLine();
        System.out.println(licence(number));

    }
}

