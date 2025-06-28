package Day4_Object_Oriented_Design_Principles;

import java.util.ArrayList;
import java.util.List;
class Faculty {
    String name;
    Faculty(String n) { name = n; }
}
class Department {
    String name;
    Department(String n) { name = n; }
}
class University {
    List<Department> departments = new ArrayList<>();
    University() {
        departments.add(new Department("CSE"));
    }
}
public class UniversityDemo {
    public static void main(String[] args) {
        Faculty f = new Faculty("Dr. Smith");
        University u = new University();
    }
}
