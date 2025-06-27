package Day3_Level_1_Lab_Practice;

public class employee_mngmt {
    static String companyName = "TCS";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    employee_mngmt(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    void show() {
        if (this instanceof employee_mngmt)
            System.out.println(name + ", ID: " + id + ", " + designation);
    }
}
