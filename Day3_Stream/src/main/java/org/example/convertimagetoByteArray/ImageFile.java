package org.example.convertimagetoByteArray;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageFile {
    public static void main(String[] args) {
        String imagePath = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\convertimagetoByteArray\\image1.jpg";

        String newImagePath = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\convertimagetoByteArray\\copy.jpg";

        try{
            byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));
            try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);

                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()){
                int byteData;
                while((byteData = byteArrayInputStream.read())!= -1){
                    byteArrayOutputStream.write(byteData);
                }

                byte[] newImageBytes = byteArrayOutputStream.toByteArray();

                try(FileOutputStream fileOutputStream = new FileOutputStream(newImagePath)){
                    fileOutputStream.write(newImageBytes);
                }
                System.out.println("image copied !!!");


                boolean flag = Arrays.equals(imageBytes,newImageBytes);
                if(flag) System.out.println("Both image are equal !!");
                else System.out.println("OOPS ! code failed to copy the image" +
                        "");

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}