package Day5_Inheritance;
class Vehicle {
    int maxSpeed;
    String model;
}
interface Refueled {
    void refuel();
}

class electric extends Vehicle {
    void charge() {
        System.out.println("Charging electric vehicle");
    }
}

class petrol extends Vehicle implements Refueled {
    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        new electric().charge();
        new petrol().refuel();
    }
}
