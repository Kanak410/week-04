package org.example.aidrivenResumescreeningsystem;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JobRoleTest {

    @Test
    void testSoftwareEngineerRole() {
        SoftwareEngineer se = new SoftwareEngineer();
        assertEquals("Software Engineer", se.getRoleName());
        assertEquals("SoftwareEngineer - Software Engineer", se.toString());
    }

    @Test
    void testDataScientistRole() {
        DataScientist ds = new DataScientist();
        assertEquals("Data Scientist", ds.getRoleName());
        assertEquals("DataScientist - Data Scientist", ds.toString());
    }

    @Test
    void testProductManagerRole() {
        ProductManager pm = new ProductManager();
        assertEquals("Product Manager", pm.getRoleName());
        assertEquals("ProductManager - Product Manager", pm.toString());
    }
}
