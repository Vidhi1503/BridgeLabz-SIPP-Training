package Day2_Java_Constructors;

public class library {
    String title, author;
    double price;
    boolean available = true;

    void borrow() {
        if (available) available = false;
    }
}
