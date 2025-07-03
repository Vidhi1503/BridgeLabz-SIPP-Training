package Day5_Inheritance;

class Order {
    int orderId;
    String orderDate;
}
class ship extends Order {
    String num;
}
class deliv extends ship {
    String date;

    void status() {
        System.out.println("Order ID: " + orderId + " delivered on " + date);
    }
}
public class OnlineRetailOrder {
    public static void main(String[] args) {
        deliv d = new deliv();
        d.orderId = 101; d.orderDate = "2025-07-01";
        d.num = "TRK123"; d.date = "2025-07-02";
        d.status();
    }
}
