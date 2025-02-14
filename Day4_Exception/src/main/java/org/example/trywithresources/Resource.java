package org.example.trywithresources;
import java.io.*;
public class Resource {
    public static void main(String[] args) {
        String path="D:\\week-04\\Day4_Exception\\src\\main\\java\\org\\example\\trywithresources\\info.txt";
        try(BufferedReader re=new BufferedReader(new FileReader(path))){
            String first=re.readLine();
            if(first!=null){
                System.out.println(first);
            }else{
                System.out.println("file is empty");
            }
        } catch (IOException e) {
            System.out.println("error reading");

        }


    }
}
