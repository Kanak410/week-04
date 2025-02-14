package org.example.mutiplecatch;
import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int [] a={5,30,50,70};
       try{
           System.out.println("enter number:");
           int ind= sc.nextInt();
           System.out.println("value at index"+ind+":"+a[ind]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid index");
       }catch (NullPointerException e){
           System.out.println("provide valid");
       }



    }
}
