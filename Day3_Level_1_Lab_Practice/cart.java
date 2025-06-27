package Day3_Level_1_Lab_Practice;

public class cart {
    static double discount = 10;
    final int productID;
    String productName;
    double price;
    int quantity;

    cart(int id, String name, double price, int qty) {
        this.productID = id;
        this.productName = name;
        this.price = price;
        this.quantity = qty;
    }
    static void dis(double d) {
        discount = d;
    }
    void show() {
        if (this instanceof cart)
            System.out.println(productName + " (ID: " + productID + ") - ₹" + price + ", Qty: " + quantity);
    }
}
