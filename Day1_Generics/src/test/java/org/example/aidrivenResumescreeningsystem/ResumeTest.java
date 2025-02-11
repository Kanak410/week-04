package org.example.aidrivenResumescreeningsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResumeTest {

    @Test
    void testResumeCreation() {
        Resume<SoftwareEngineer> seResume = new Resume<>("Ali", new SoftwareEngineer());

        assertEquals("Ali", seResume.getCandidateName());
        assertEquals("Software Engineer", seResume.getJobRole().getRoleName());
        assertEquals("Resume: Ali (Applying for: SoftwareEngineer - Software Engineer)", seResume.toString());
    }
}
