package org.example.mapinterface.groupobjectsbyProperty;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupEmployees {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();
        for (Employee employee : employees) {
            groupedMap.computeIfAbsent(employee.department, k -> new ArrayList<>()).add(employee);
        }
        return groupedMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        System.out.println(groupByDepartment(employees));
    }
}
