abstract class Employee {
    int id; String name;
    void display() { System.out.println(name + " - " + id); }
    abstract double salary();
}
interface Department {
    void depart();
}
class FullTime extends Employee implements Department {
    public double salary() { return 50000; }
    public void depart() { System.out.println("Full-time Dept"); }
}
class PartTime extends Employee implements Department {
    public double salary() { return 20000; }
    public void depart() { System.out.println("Part-time Dept"); }
}

public class employee_mngmt_system {
    public static void main(String[] args) {
        Employee[] e = { new FullTime(), new PartTime() };
        for (Employee emp : e) {
            emp.name = "A"; emp.id = 1;
            emp.display();
            System.out.println("Salary: " + emp.salary());
        }
    }
}
