package Day2_Java_Constructors;
class Books {
    String title, author;
    double price;

    Books() {}
    Books(String t, String a, double p) {
        title = t; author = a; price = p;
    }
}
