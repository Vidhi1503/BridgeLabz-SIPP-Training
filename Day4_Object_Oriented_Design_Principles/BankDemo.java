package Day4_Object_Oriented_Design_Principles;

class Customer {
    String name;
    Customer(String n) { name = n; }
    void viewBalance() { System.out.println(name + " views balance"); }
}

class Bank {
    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Alice");
        Bank b = new Bank();
        b.openAccount(c);
        c.viewBalance();
    }
}
