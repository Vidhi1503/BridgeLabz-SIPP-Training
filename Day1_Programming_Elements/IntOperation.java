import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        int ans1 = a + b * c;
        int ans2 = a * b + c;
        int ans3 = c + a / b;
        int ans4 = a % b + c;

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + ans1);
        System.out.println("a * b + c = " + ans2);
        System.out.println("c + a / b = " + ans3);
        System.out.println("a % b + c = " + ans4);
    }
}
