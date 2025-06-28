package Day4_Object_Oriented_Design_Principles;
import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();
    Course(String n) { name = n; }
    void enroll(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + name);
    }
}
class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String n) { name = n; }
    void enroll(Course c) {
        courses.add(c);
        c.enroll(this);
    }
}
class School {
    List<Student> students = new ArrayList<>();
    void addStudent(Student s) { students.add(s); }
}
public class SchoolDemo {
    public static void main(String[] args) {
        Student s = new Student("Tom");
        Course c = new Course("Math");
        School sch = new School();
        sch.addStudent(s);
        s.enroll(c);
    }
}
