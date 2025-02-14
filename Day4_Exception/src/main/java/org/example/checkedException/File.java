package org.example.checkedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        String path="D:\\week-04\\Day4_Exception\\src\\main\\java\\org\\example\\checkedException\\data.txt";
        try(BufferedReader b=new BufferedReader(new FileReader(path))){
            String line;
            while ((line=b.readLine())!=null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }catch(IOException e){
            System.out.println("error ocuurred");
        }


    }
}
