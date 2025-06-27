package Day3_Level_1_Lab_Practice;

public class vehicle {
    static int registrationFee = 5000;
    final String registrationNumber;
    String ownerName, vehicleType;

    vehicle(String name, String type, String regNo) {
        this.ownerName = name;
        this.vehicleType = type;
        this.registrationNumber = regNo;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    void show() {
        if (this instanceof vehicle)
            System.out.println(vehicleType + " owned by " + ownerName + ", Reg No: " + registrationNumber);
    }
}

