package org.example.aidrivenResumescreeningsystem;

import java.util.List;

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume: " + candidateName + " (Applying for: " + jobRole + ")";
    }
}


class ResumeScreeningSystem {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Processing resume for: " + resume);
        }
    }
}
