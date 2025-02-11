package org.example.multilevelUniversityCourseManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testCourseCreation() {
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", new ExamCourse("Final Exam"));

        assertEquals("Mathematics", mathCourse.getCourseName());
        assertEquals("Final Exam", mathCourse.getCourseType().getName());
        assertEquals("Course: Mathematics (ExamCourse: Final Exam)", mathCourse.toString());
    }
}
