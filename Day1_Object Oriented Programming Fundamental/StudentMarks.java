import java.util.Scanner;
public class StudentMarks {
    public static int calculateTotal(int marks1, int marks2, int marks3) {
        return marks1 + marks2 + marks3;
    }
    public static double calculateAverage(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    public static void displayResults(String name, int total, double average) {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int marks3 = scanner.nextInt();

        int total = calculateTotal(marks1, marks2, marks3);
        double average = calculateAverage(total, 3);

        displayResults(name, total, average);

        scanner.close();
    }
}
