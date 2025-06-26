package Day2_Java_Constructors;

public class bank {
    public int num;
    protected String str;
    private double balance;

    public void setBalance(double b) { balance = b; }
    public double getBalance() { return balance; }
}

class save extends bank {
    void res() {
        System.out.println(num + " " + str);
    }
}
