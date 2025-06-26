package Day1_Java_Class_and_Object;

public class movie {
    String movieName;
    int seatNumber;
    double price;

    void book(String m, int s, double p) {
        movieName = m; seatNumber = s; price = p;
    }
    void display() {
        System.out.println(movieName + " Seat: " + seatNumber + " Price: " + price);
    }
}

