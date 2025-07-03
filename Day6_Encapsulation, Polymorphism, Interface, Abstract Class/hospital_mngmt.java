abstract class Patient {
    String name;
    void details() { System.out.println(name); }
    abstract double bill();
}
interface MedicalRecord {
    void add();
}
class InPatient extends Patient implements MedicalRecord {
    public double bill() { return 5000; }
    public void add() {}
}
class OutPatient extends Patient {
    public double bill() { return 500; }
}
public class hospital_mngmt {
    public static void main(String[] args) {
        Patient[] p = { new InPatient(), new OutPatient() };
        for (Patient x : p) {
            x.name = "Ram";
            x.details();
            System.out.println("Bill: " + x.bill());
        }
    }
}
