package org.example.convertuppercasetolowercase;
import java.io.*;

public class Upper {
    public static void main(String[] args) {
        String inputFile = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\convertuppercasetolowercase\\in.txt";
        String outputFile = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\convertuppercasetolowercase\\out.txt";

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("File processing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}


