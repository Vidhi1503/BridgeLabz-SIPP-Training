import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter double a: ");
        double a = sc.nextDouble();
        System.out.print("Enter double b: ");
        double b = sc.nextDouble();
        System.out.print("Enter double c: ");
        double c = sc.nextDouble();
        double ans1 = a + b * c;
        double ans2 = a * b + c;
        double ans3 = c + a / b;
        double ans4 = a % b + c;
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + ans1);
        System.out.println("a * b + c = " + ans2);
        System.out.println("c + a / b = " + ans3);
        System.out.println("a % b + c = " + ans4);
    }
}
