import java.util.*;
class sum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum = 0;
    while (true) {
      int n = s.nextInt();
      if (n <= 0) break;
      sum += n;
    }
    System.out.println("Sum = " + sum);
  }
}
