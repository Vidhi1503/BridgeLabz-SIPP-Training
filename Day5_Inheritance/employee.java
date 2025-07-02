package Day5_Inheritance;

class Employee {
    String name;
    int id;
    double salary;
    void detail() {
        System.out.println(name + " | ID: " + id + " | Salary: " + salary);
    }
}
class Manager extends Employee {
    int size;
    void detail() {
        super.detail();
        System.out.println("Team Size: " + size);
    }
}
class Developer extends Employee {
    String prog;
    void detail() {
        super.detail();
        System.out.println("Language: " + prog);
    }
}
class Intern extends Employee {
    String mentor;
    void detail() {
        super.detail();
        System.out.println("Mentor: " + mentor);
    }
}
public class employee {
    public static void main(String[] args) {
        Manager m = new Manager(); m.name = "A"; m.id = 1; m.salary = 50000; m.size = 5;
        Developer d = new Developer(); d.name = "B"; d.id = 2; d.salary = 40000; d.prog = "Java";
        Intern i = new Intern(); i.name = "C"; i.id = 3; i.salary = 10000; i.mentor = "A";

        Employee[] empList = { m, d, i };
        for (Employee e : empList) {
            e.detail();
        }
    }
}
