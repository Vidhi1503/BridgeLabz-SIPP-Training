package Day2_Java_Constructors;

public class system {
    public int roll;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) { CGPA = c; }
    public double getCGPA() { return CGPA; }
}
class post extends system {
    void res() {
        System.out.println(name);
    }
}

