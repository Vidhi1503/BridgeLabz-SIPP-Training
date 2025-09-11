package Day2_Functional_Interfaces;

interface Payment { void pay(double amt); }
class UPI implements Payment { public void pay(double a){System.out.println("UPI: "+a);} }
class CreditCard implements Payment { public void pay(double a){System.out.println("CreditCard: "+a);} }
class Wallet implements Payment { public void pay(double a){System.out.println("Wallet: "+a);} }
public class DigitalPayment {
    public static void main(String[]a){
        Payment[] p={new UPI(),new CreditCard(),new Wallet()};
        for(Payment x:p) x.pay(1000);
    }
}
