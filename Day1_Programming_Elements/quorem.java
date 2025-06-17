import java.util.Scanner;

public class quorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int quo = num1 / num2;
        int rem = num1 % num2;
        
        System.out.println("The quo is " + quo + " and rem is " + rem + " of two numbers " + num1 + " and " + num2);
    }
}
