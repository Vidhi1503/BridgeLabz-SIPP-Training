package Day2_Functional_Interfaces;

interface DeviceControl { void turnOn(); void turnOff(); }
class Light implements DeviceControl {
    public void turnOn(){ System.out.println("Light ON"); }
    public void turnOff(){ System.out.println("Light OFF"); }
}
class AC implements DeviceControl {
    public void turnOn(){ System.out.println("AC ON"); }
    public void turnOff(){ System.out.println("AC OFF"); }
}
class TV implements DeviceControl {
    public void turnOn(){ System.out.println("TV ON"); }
    public void turnOff(){ System.out.println("TV OFF"); }
}
public class SmartDeviceControl {
    public static void main(String[] a){
        DeviceControl[] d={new Light(),new AC(),new TV()};
        for(DeviceControl x:d){x.turnOn();x.turnOff();}
    }
}
