package org.example.aidrivenResumescreeningsystem;


    abstract class JobRole {
        private String roleName;

        public JobRole(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleName() {
            return roleName;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + " - " + roleName;
        }
    }

    // Different job roles
    class SoftwareEngineer extends JobRole {
        public SoftwareEngineer() {
            super("Software Engineer");
        }
    }

    class DataScientist extends JobRole {
        public DataScientist() {
            super("Data Scientist");
        }
    }

    class ProductManager extends JobRole {
        public ProductManager() {
            super("Product Manager");
        }
    }

