package Day1_Java_Class_and_Object;

public class student {
    String name;
    int rollNumber;
    int marks;

    char getGrade() {
        return marks >= 90 ? 'A' : marks >= 75 ? 'B' : 'C';
    }

    void display() {
        System.out.println(name + " " + rollNumber + " Grade: " + getGrade());
    }
}