package com.bytearray;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageFile {
    public static void main(String[] args) {
        String imagePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/cat-sunglasses" +
                "-gangster-digital-art-animal-4k-wallpaper-uhdpaper.com-241@0@j.jpg";
        // image path -> Ye hamare source image ka path h jisme ek image input dena hota hai
        String newImagePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/cat.jpg";
        // new Image Path -> ye ek empty cat.jpg name ka file add krna h jisme apan write krnge image ko

        try{
            byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));
            try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);// iss line me apan
                // ne read kiya unnn bytes ko jo image Bytes me store hai
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()){
                int byteData;
                while((byteData = byteArrayInputStream.read())!= -1){
                    byteArrayOutputStream.write(byteData);
                }

                byte[] newImageBytes = byteArrayOutputStream.toByteArray();// ab jo data output stream me store hai

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