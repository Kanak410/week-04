package org.example.serialization;


import java.io.*;
import java.util.Arrays;
import java.util.List;

class Employee implements Serializable{
    private int id;
    private String name;
    private String department;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class EmployeeMangement {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Kanak", "CEO", 9000000),
                new Employee(2, "Sakshi", "IT", 1000000),
                new Employee(3, "Ayan", "IT", 2000000)
        );
        String filePath = "D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\serialization\\Text.txt";

        //Serialization
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutputStream.writeObject(employees);
            System.out.println("Object successfully serialized");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Deserialization
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            List<Employee> des =  (List<Employee>) objectInputStream.readObject();

            for(Employee employee:des){
                System.out.println(employee.toString());
            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
