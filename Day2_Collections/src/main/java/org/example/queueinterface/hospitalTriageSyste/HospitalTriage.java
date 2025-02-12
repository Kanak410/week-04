package org.example.queueinterface.hospitalTriageSyste;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;


    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Override compareTo method to sort by severity (highest priority first)
    @Override
    public int compareTo(Patient other) {
        // Negative because we want higher severity to be treated first (descending order)
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // Create a PriorityQueue that orders by severity (highest first)
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        // Add patients to the queue
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Print the order of treatment (patients will be dequeued based on highest severity)
        System.out.println("Order of Treatment:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());  // Treat patients in order of severity
        }
    }
}

