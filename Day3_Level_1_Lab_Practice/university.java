package Day3_Level_1_Lab_Practice;

public class university {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;

    university(String name, int roll, char grade) {
        this.name = name;
        this.rollNumber = roll;
        this.grade = grade;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    void show() {
        if (this instanceof university)
            System.out.println(name + ", Roll: " + rollNumber + ", Grade: " + grade);
    }
}

