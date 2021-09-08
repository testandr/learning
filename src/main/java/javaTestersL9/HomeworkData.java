package javaTestersL9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeworkData {

    public static Course getRandomCourse() {

        return new Course() {
            @Override
            public String toString() {
                Random random = new Random();
                List<String> courses = List.of("Java", "Go", "Python", "Swift", "JavaScript", "C#");
                return courses.get(random.nextInt(courses.size()));
            }
        };
    }

    public static List<Student> getStudentList() {

        Course course1 = new Course() {
            @Override
            public String toString(){
                return "Java";
            }
        };

        Course course2 = new Course() {
            @Override
            public String toString(){
                return "Go";
            }
        };

        Course course3 = new Course() {
            @Override
            public String toString(){
                return "Python";
            }
        };


        Course course4 = new Course() {
            @Override
            public String toString(){
                return "Swift";
            }
        };

        Course course5 = new Course() {
            @Override
            public String toString(){
                return "JavaScript";
            }
        };

        Course course6 = new Course() {
            @Override
            public String toString(){
                return "C#";
            }
        };

        Student student1 = new Student() {
            @Override
            public String getName() {
                return "Student 1";
            }

            @Override
            public List<Course> getAllCourses() {
                return List.of(course1, course2);
            }
        };

        Student student2 = new Student() {
            @Override
            public String getName() {
                return "Student 2";
            }

            @Override
            public List<Course> getAllCourses() {
                return List.of(course3);
            }
        };

        Student student3 = new Student() {
            @Override
            public String getName() {
                return "Student 3";
            }

            @Override
            public List<Course> getAllCourses() {
                return List.of(course1, course2, course4);
            }
        };

        Student student4 = new Student() {
            @Override
            public String getName() {
                return "Student 4";
            }

            @Override
            public List<Course> getAllCourses() {
                return List.of(course2, course4);
            }
        };

        Student student5 = new Student() {
            @Override
            public String getName() {
                return "Student 5";
            }

            @Override
            public List<Course> getAllCourses() {
                return List.of(course2, course3, course4);
            }
        };

        Student student6 = new Student() {
            @Override
            public String getName() {
                return "Student 6";
            }

            @Override
            public List<Course> getAllCourses() {
                return List.of(course1);
            }
        };

        return new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6));
    }
}