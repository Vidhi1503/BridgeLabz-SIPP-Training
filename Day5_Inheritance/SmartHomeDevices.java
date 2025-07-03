package Day5_Inheritance;
class Device {
    String deviceId;
    String status;
}
class thermo extends Device {
    int temp;
    void disp() {
        System.out.println("ID: " + deviceId + ", Status: " + status + ", Temp: " + temp);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        thermo t = new thermo();
        t.deviceId = "T100"; t.status = "On"; t.temp = 22;
        t.disp();
    }
}
