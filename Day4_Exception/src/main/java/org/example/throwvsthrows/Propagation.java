package org.example.throwvsthrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Propagation {
    public static void main(String[] args) {
        String path="D:\\week-04\\Day4_Exception\\src\\main\\java\\org\\example\\throwvsthrows\\input.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String first=br.readLine();
            if(first!=null){
                System.out.println(first);
            }else{
                System.out.println("file empty");
            }
        }catch (IOException e){
            System.out.println("error reading");
        }
        try{
            double inter=calculateInterest(1000,5,2);

            System.out.println("calculate interest:"+inter);
        }catch (IllegalArgumentException e){
            System.out.println("invalid input");
        }
    }
    public static double calculateInterest(double amount,double rate,int years)throws IllegalArgumentException{
        if(amount<0 || rate<0){
            throw new IllegalArgumentException();
        }
        return  amount*rate*years/100;
    }
}
