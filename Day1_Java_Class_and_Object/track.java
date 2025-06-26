package Day1_Java_Class_and_Object;

public class track {
    int itemCode;
    String itemName;
    double price;

    void display(int qty) {
        System.out.println(itemName + " Total: " + (price * qty));
    }
}

