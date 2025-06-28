package Day4_Object_Oriented_Design_Principles;
class Patient {
    String name;
    Patient(String n) { name = n; }
}
class Doctor {
    String name;
    Doctor(String n) { name = n; }
    void consult(Patient p) {
        System.out.println(name + " consults " + p.name);
    }
}
public class HospitalDemo {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Lee");
        Patient p = new Patient("John");
        d.consult(p);
    }
}
