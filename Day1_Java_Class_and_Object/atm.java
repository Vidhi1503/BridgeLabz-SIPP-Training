package Day1_Java_Class_and_Object;

public class atm {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { if (balance >= amt) balance -= amt; }
    void display() { System.out.println("Balance: " + balance); }
}