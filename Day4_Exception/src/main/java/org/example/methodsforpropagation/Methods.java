package org.example.methodsforpropagation;
import java.io.*;
import java.util.*;
public class Methods {
    public static void main(String[] args) {
       try{
           method2();
       }catch (ArithmeticException e){
           System.out.println("Handled exception in main");
       }
    }
    public static void method2(){
        method1();
    }
    public static void method1(){
        throw new ArithmeticException("10/0 b cause exception");
    }
}
