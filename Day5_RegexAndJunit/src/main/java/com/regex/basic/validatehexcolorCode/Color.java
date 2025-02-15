package com.regex.basic.validatehexcolorCode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Color {
    public static boolean hex(String color){
        String regex="^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex,color);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the color: ");
        String color=sc.nextLine();
        System.out.println(hex(color));
    }
}
