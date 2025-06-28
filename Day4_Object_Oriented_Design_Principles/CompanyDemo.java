package Day4_Object_Oriented_Design_Principles;

class Employee {
    String name;
    Employee(String n) { name = n; }
}

class Department {
    Employee e;
    Department(String ename) { e = new Employee(ename); }
}

class Company {
    Department d;
    Company(String ename) { d = new Department(ename); }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company c = new Company("John");
    }
}
