package javaTestersL9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {
        List<Student> students = HomeworkData.getStudentList();
        System.out.println(getUnicsCourses(students));
//        System.out.println(getStudentWithMoreCourses(students));
    }

    public static List<Course> getUnicsCourses(List<Student> students){
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }

//    public static List<Student> getStudentWithMoreCourses(List<Student> students){
//        return  students.stream()
//
//
//    }
//
//    public static List<Student> getStudentWithCourse(List<Student> students, Course course){
//
//
//    }
}
