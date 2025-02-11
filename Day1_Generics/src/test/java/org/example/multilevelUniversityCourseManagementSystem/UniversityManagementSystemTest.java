package org.example.multilevelUniversityCourseManagementSystem;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {
    private List<Course<? extends CourseType>> courseList;
    @BeforeEach
    void setUp(){
        courseList = new ArrayList<>();
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", new ExamCourse("Final Exam"));
        Course<AssignmentCourse> programming  = new Course<>("C++", new AssignmentCourse("Project-Based"));
        Course<ResearchCourse> aiml = new Course<>("Artificial Intelligence",new ResearchCourse("Thesis"));

        courseList.add(mathCourse);
        courseList.add(programming);
        courseList.add(aiml);
    }

    @Test
    void TestUniversity(){
        Assertions.assertEquals("C++",courseList.get(1).getCourseName());
    }

}