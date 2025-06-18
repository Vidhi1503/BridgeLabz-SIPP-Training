package Day3_Arrays;

import java.util.*;
class Q1 {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[5];
    for (int i = 0; i < 5; i++) {
      n[i] = s.nextInt();
      if (n[i] > 0) System.out.println(n[i] % 2 == 0 ? "Even" : "Odd");
      else if (n[i] < 0) System.out.println("Negative");
      else System.out.println("Zero");
    }
    System.out.println(n[0] == n[4] ? "Equal" : (n[0] > n[4] ? "Greater" : "Less"));
  }
}
