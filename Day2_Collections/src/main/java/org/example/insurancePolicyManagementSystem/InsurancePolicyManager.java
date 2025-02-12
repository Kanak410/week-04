package org.example.insurancePolicyManagementSystem;
import java.util.*;

public class InsurancePolicyManager {
    // HashSet for quick lookups
    private Set<Policy> policySet = new HashSet<>();
    // LinkedHashSet to maintain order of insertion
    private Set<Policy> orderedPolicySet = new LinkedHashSet<>();
    // TreeSet to maintain sorted policies by expiry date
    private Set<Policy> sortedPolicySet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    // Add a policy to all sets
    public void addPolicy(Policy policy) {
        policySet.add(policy);
        orderedPolicySet.add(policy);
        sortedPolicySet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("All Policies:");
        policySet.forEach(System.out::println);
    }

    // Retrieve policies expiring soon (within the next 30 days)
    public void displayPoliciesExpiringSoon() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thirtyDaysLater = calendar.getTime();

        System.out.println("Policies Expiring Soon:");
        policySet.stream()
                .filter(policy -> policy.getExpiryDate().before(thirtyDaysLater))
                .forEach(System.out::println);
    }

    // Retrieve policies with a specific coverage type
    public void displayPoliciesByCoverage(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        policySet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    // Identify and display duplicate policies based on policy number
    public void displayDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        System.out.println("Duplicate Policies:");
        policySet.stream()
                .filter(policy -> !seen.add(policy.getPolicyNumber())) // If policy number is already added, it's a duplicate
                .forEach(System.out::println);
    }

    // Display policies in insertion order (LinkedHashSet)
    public void displayOrderedPolicies() {
        System.out.println("Ordered Policies (insertion order):");
        orderedPolicySet.forEach(System.out::println);
    }

    // Display policies sorted by expiry date (TreeSet)
    public void displaySortedPolicies() {
        System.out.println("Policies Sorted by Expiry Date:");
        sortedPolicySet.forEach(System.out::println);
    }

    // Performance comparison (adding, removing, and searching)
    public void comparePerformance(Policy policy) {
        long startTime = System.nanoTime();
        policySet.add(policy);
        long endTime = System.nanoTime();
        System.out.println("HashSet Add Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        orderedPolicySet.add(policy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        sortedPolicySet.add(policy);
        endTime = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (endTime - startTime));

        // Removing and searching can be done similarly by measuring the time for those operations.
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        // Sample policies
        Policy policy1 = new Policy("P001", "sahil", new Date(System.currentTimeMillis() + 5L * 24 * 60 * 60 * 1000), "Health", 300.0);
        Policy policy2 = new Policy("P002", "ayan", new Date(System.currentTimeMillis() + 25L * 24 * 60 * 60 * 1000), "Auto", 500.0);
        Policy policy3 = new Policy("P003", "aman", new Date(System.currentTimeMillis() + 10L * 24 * 60 * 60 * 1000), "Home", 200.0);

        // Add policies
        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        // Display policies based on various criteria
        manager.displayAllPolicies();
        manager.displayPoliciesExpiringSoon();
        manager.displayPoliciesByCoverage("Health");
        manager.displayDuplicatePolicies();
        manager.displayOrderedPolicies();
        manager.displaySortedPolicies();

        // Performance comparison
        manager.comparePerformance(policy1);
    }
}

