package org.example.storeandRetrieveprimitiveData;
import java.io.*;

public class Student {
    public static void main(String[] args) {
        String fileName = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\storeandRetrieveprimitiveData\\student_data.bin";

        // Writing data to file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(71);
            dos.writeUTF("kanak rajput");
            dos.writeDouble(8.98);
            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading data from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

