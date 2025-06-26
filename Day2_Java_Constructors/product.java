package Day2_Java_Constructors;

public class product {
    String str;
    double price;
    static int total = 0;

    product(String n, double p) {
        str = n; price = p; total++;
    }

    void detail() {
        System.out.println(str + " " + price);
    }

    static void totals() {
        System.out.println("Total: " + total);
    }
}

