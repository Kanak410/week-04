package com.regex.basic.validateaUsername;
import java.util.regex.*;
import java.util.Scanner;
public class Check {



        public static boolean isValidUsername(String username) {
            String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
            return Pattern.matches(regex, username);
        }

        public static void main(String[] args) {
            System.out.println("enter the username");
            Scanner sc=new Scanner(System.in);
            String username=sc.nextLine();
            System.out.println(isValidUsername(username));

        }


}
