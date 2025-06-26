package Day2_Java_Constructors;

public class car_rent {
    String customerName, carModel;
    int rentalDays;

    car_rent(String n, String c, int d) {
        customerName = n; carModel = c; rentalDays = d;
    }

    double totalCost() {
        return rentalDays * 500;
    }
}
