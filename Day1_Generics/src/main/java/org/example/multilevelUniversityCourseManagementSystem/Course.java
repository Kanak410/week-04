package org.example.multilevelUniversityCourseManagementSystem;


import java.util.List;

class Course<T extends CourseType> {
        private String courseName;
        private T courseType;

        public Course(String courseName, T courseType) {
            this.courseName = courseName;
            this.courseType = courseType;
        }

        public String getCourseName() {
            return courseName;
        }

        public T getCourseType() {
            return courseType;
        }

        @Override
        public String toString() {
            return "Course: " + courseName + " (" + courseType + ")";
        }
    }


    // Utility class to display courses
    class CourseUtils {
        public static void displayCourses(List<? extends CourseType> courses) {
            for (CourseType course : courses) {
                System.out.println(course);
            }
        }

}
