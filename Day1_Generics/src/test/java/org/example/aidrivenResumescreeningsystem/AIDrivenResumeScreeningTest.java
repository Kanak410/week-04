package org.example.aidrivenResumescreeningsystem;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
class AIDrivenResumeScreeningTest {




        @Test
        void testProcessResumes() {
            // Capture console output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            List<JobRole> resumeList = new ArrayList<>();
            resumeList.add(new SoftwareEngineer());
            resumeList.add(new DataScientist());
            resumeList.add(new ProductManager());

            ResumeScreeningSystem.processResumes(resumeList);

            // Restore normal console output
            System.setOut(System.out);

            // Expected output
            String expectedOutput = "Processing resume for: SoftwareEngineer - Software Engineer\n" +
                    "Processing resume for: DataScientist - Data Scientist\n" +
                    "Processing resume for: ProductManager - Product Manager\n";

            assertEquals(expectedOutput, outputStream.toString());
        }
    }


