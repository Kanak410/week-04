package org.example.insurancePolicyManagementSystemMap;




import java.util.*;

class InsurancePolicy {
    private String policyNumber;
    private String policyHolder;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyHolder, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolder + " | " + expiryDate + " | " + coverageType + " | $" + premiumAmount;
    }
}

class PolicyManagement {
    public Map<String, InsurancePolicy> policies = new HashMap<>();
    private Map<String, InsurancePolicy> orderedPolicies = new LinkedHashMap<>();
    private TreeMap<Date, InsurancePolicy> sortedByExpiry = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policies.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);
        sortedByExpiry.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy getPolicy(String policyNumber) {
        return policies.get(policyNumber);
    }

    public List<InsurancePolicy> getExpiringSoon(int days) {
        Date now = new Date();
        Date threshold = new Date(now.getTime() + (long) days * 24 * 60 * 60 * 1000);
        return new ArrayList<>(sortedByExpiry.headMap(threshold, true).values());
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        sortedByExpiry.headMap(now, true).clear();
        policies.values().removeIf(policy -> policy.getExpiryDate().before(now));
        orderedPolicies.values().removeIf(policy -> policy.getExpiryDate().before(now));
    }
}
    public class Policy {
        public static void main(String[] args) {
            PolicyManagement policyManagement = new PolicyManagement();

            policyManagement.addPolicy(new InsurancePolicy("P001", "Alice", new Date(2025, 3, 15), "Health", 500.0));
            policyManagement.addPolicy(new InsurancePolicy("P002", "Bob", new Date(2024, 2, 20), "Auto", 300.0));
            policyManagement.addPolicy(new InsurancePolicy("P003", "Charlie", new Date(2024, 5, 10), "Home", 700.0));

            System.out.println("Policy P001: " + policyManagement.getPolicy("P001"));
            System.out.println("Expiring soon (within 30 days): " + policyManagement.getExpiringSoon(30));
            policyManagement.removeExpiredPolicies();
            System.out.println("Policies after removing expired: " + policyManagement.policies);
        }
}
