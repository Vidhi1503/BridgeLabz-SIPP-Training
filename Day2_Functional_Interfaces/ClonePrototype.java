package Day2_Functional_Interfaces;

class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException {return super.clone();}
}
public class ClonePrototype {
    public static void main(String[]a) throws Exception {
        Prototype p=new Prototype();
        Prototype c=(Prototype)p.clone();
        System.out.println("Cloned: "+(c!=p));
    }
}
