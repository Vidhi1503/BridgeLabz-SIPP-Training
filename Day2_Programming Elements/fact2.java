import java.util.*;
class fact2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt(), f = 1, i = 1;
    if (n >= 0) while (i <= n) f *= i++;
    System.out.println("Factorial = " + f);
  }
}
