package org.example.readalargeFile;
import java.io.*;

public class LargeFile{
    public static void main(String[] args) {
        String filePath = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\readalargeFile\\largefile.txt"; // Change this to the actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
