package Day2_Java_Constructors;

public class hotel {
    String guestName, roomType;
    int nights;
    hotel() {}
    hotel(String g, String r, int n) {
        guestName = g; roomType = r; nights = n;
    }
    hotel(hotel h) {
        guestName = h.guestName; roomType = h.roomType; nights = h.nights;
    }
}

