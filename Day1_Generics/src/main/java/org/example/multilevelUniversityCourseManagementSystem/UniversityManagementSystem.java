package org.example.multilevelUniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", new ExamCourse("Final Exam"));
        Course<AssignmentCourse> csCourse = new Course<>("Computer Science", new AssignmentCourse("Project-Based"));
        Course<ResearchCourse> physicsCourse = new Course<>("Physics", new ResearchCourse("Thesis"));

        List<CourseType> courseList = new ArrayList<>();
        courseList.add(mathCourse.getCourseType());
        courseList.add(csCourse.getCourseType());
        courseList.add(physicsCourse.getCourseType());

        System.out.println("University Courses:");
        CourseUtils.displayCourses(courseList);
    }
}
