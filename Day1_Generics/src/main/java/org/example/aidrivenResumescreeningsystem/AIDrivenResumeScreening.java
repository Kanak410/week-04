package org.example.aidrivenResumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class AIDrivenResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Ali", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Sakshi", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Kanak" , new ProductManager());

        List<JobRole> resumeList = new ArrayList<>();
        resumeList.add(seResume.getJobRole());
        resumeList.add(dsResume.getJobRole());
        resumeList.add(pmResume.getJobRole());

        System.out.println("AI-Driven Resume Screening:");
        ResumeScreeningSystem.processResumes(resumeList);
    }}
