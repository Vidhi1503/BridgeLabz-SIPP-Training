abstract class Vehicle {
    double rate;
    abstract double fare(double km);
}
interface GPS {
    String location();
}
class Car extends Vehicle implements GPS {
    public double fare(double km) { return km * rate; }
    public String location() { return "A"; }
}
class Bike extends Vehicle implements GPS {
    public double fare(double km) { return km * rate * 0.8; }
    public String location() { return "B"; }
}
public class ride_hail {
    public static void main(String[] args) {
        Vehicle[] v = { new Car(), new Bike() };
        for (Vehicle x : v) {
            x.rate = 10;
            System.out.println("Fare: " + x.fare(5));
        }
    }
}
