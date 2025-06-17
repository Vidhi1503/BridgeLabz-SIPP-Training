import java.util.*;
class sum2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt(), sum = 0, i = 1;
    if (n >= 1) {
      while (i <= n) sum += i++;
      int formula = n * (n + 1) / 2;
      System.out.println("While Sum = " + sum + ", Formula Sum = " + formula);
    } else 
    System.out.println("Not a natural number");
  }
}
