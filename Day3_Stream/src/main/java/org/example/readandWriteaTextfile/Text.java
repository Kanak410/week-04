package org.example.readandWriteaTextfile;
import java.io.*;
public class Text {
    public static void main(String[] args) {
        String Samplefile="D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\readandWriteaTextfile\\sample";
        String designfile="D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\readandWriteaTextfile\\Design";
        try(FileInputStream f=new FileInputStream(Samplefile);
            FileOutputStream fo=new FileOutputStream(designfile)){
            int byteData;
            while((byteData=f.read())!=-1){
                fo.write(byteData);
            }
            System.out.println("File copied");

        }catch (FileNotFoundException e){
            System.out.println("Erorr file not found");

        } catch (IOException e){
            System.out.println("erorr an i/o error");
        }


    }
}
