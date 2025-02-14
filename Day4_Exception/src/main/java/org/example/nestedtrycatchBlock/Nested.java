package org.example.nestedtrycatchBlock;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter size");
            int n= sc.nextInt();
            int [] array=new int[n];
            System.out.println("enter the index");
            int ind= sc.nextInt();
            System.out.println("enter the diuisor");
            int div=sc.nextInt();
            try{
                int ele=array[ind];
                try{
                    int res=ele/div;
                    System.out.println("result"+res);
                }catch (ArithmeticException e){
                    System.out.println("cannot divide");
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("invalid index");
            }
        }catch (Exception e){
            System.out.println("error");
        }finally {
            sc.close();
        }

    }
}
