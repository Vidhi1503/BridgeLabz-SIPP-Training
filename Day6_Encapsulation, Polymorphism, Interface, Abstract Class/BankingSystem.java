abstract class BankAccount {
    String name; double balance;
    void deposit(double a) { balance += a; }
    void withdraw(double a) { balance -= a; }
    abstract double interest();
}
interface Loanable {
    double loan();
}
class saving extends BankAccount implements Loanable {
    public double interest() { return balance * 0.05; }
    public double loan() { return balance * 0.5; }
}
class current extends BankAccount {
    public double interest() { return balance * 0.02; }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] a = { new saving(), new current() };
        for (BankAccount x : a) {
            x.name = "User"; x.balance = 10000;
            System.out.println("Interest: " + x.interest());
        }
    }
}
