package Day2_Functional_Interfaces;

interface VehicleRental { void rent(); void returnVehicle(); }
class Car implements VehicleRental {
    public void rent(){System.out.println("Car rented");}
    public void returnVehicle(){System.out.println("Car returned");}
}
class Bike implements VehicleRental {
    public void rent(){System.out.println("Bike rented");}
    public void returnVehicle(){System.out.println("Bike returned");}
}
class Bus implements VehicleRental {
    public void rent(){System.out.println("Bus rented");}
    public void returnVehicle(){System.out.println("Bus returned");}
}
public class MultiVehicleRental {
    public static void main(String[]a){
        VehicleRental[] v={new Car(),new Bike(),new Bus()};
        for(VehicleRental x:v){x.rent();x.returnVehicle();}
    }
}
