package Day1_Java_Class_and_Object;

public class shopping {
    String itemName;
    double price;
    int quantity;

    void addItem(String n, double p, int q) {
        itemName = n; price = p; quantity = q;
    }
    void removeItem() { quantity = 0; }
    void displayTotal() {
        System.out.println("Total: " + (price * quantity));
    }
}

