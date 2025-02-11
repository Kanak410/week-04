package org.example.multilevelUniversityCourseManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTypeTest {

    @Test
    void testExamCourse() {
        ExamCourse examCourse = new ExamCourse("Final Exam");
        assertEquals("Final Exam", examCourse.getName());
        assertEquals("ExamCourse: Final Exam", examCourse.toString());
    }

    @Test
    void testAssignmentCourse() {
        AssignmentCourse assignmentCourse = new AssignmentCourse("Project-Based");
        assertEquals("Project-Based", assignmentCourse.getName());
        assertEquals("AssignmentCourse: Project-Based", assignmentCourse.toString());
    }

    @Test
    void testResearchCourse() {
        ResearchCourse researchCourse = new ResearchCourse("Thesis");
        assertEquals("Thesis", researchCourse.getName());
        assertEquals("ResearchCourse: Thesis", researchCourse.toString());
    }
}
