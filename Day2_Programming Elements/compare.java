import java.util.*;
class compare {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    if (n >= 1) {
      for (int i = 1; i <= n; i++) sum += i;
      int formula = n * (n + 1) / 2;
      System.out.println("For Sum = " + sum + ", Formula Sum = " + formula);
    } else System.out.println("Not a natural number");
  }
}
