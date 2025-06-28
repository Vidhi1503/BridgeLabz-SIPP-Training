package Day4_Object_Oriented_Design_Principles;
import java.util.*;

class Product {
    String str;
    Product(String n) { str = n; }
}
class Order {
    List<Product> pro = new ArrayList<>();
    void addProduct(Product p) { pro.add(p); }
}
class Customer {
    String str;
    Customer(String n) { str = n; }
    void place(Order o) {
        System.out.println(str + " placed an order");
    }
}
public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Nina");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));
        c.place(o);
    }
}
