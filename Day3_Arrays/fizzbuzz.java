package Day3_Arrays;

import java.util.*;
class Q4 {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String[] arr = new String[n+1];
    for (int i = 0; i <= n; i++)
      arr[i] = i % 15 == 0 ? "FizzBuzz" : (i % 3 == 0 ? "Fizz" : (i % 5 == 0 ? "Buzz" : i + ""));
    for (int i = 0; i <= n; i++) System.out.println("Position " + i + " = " + arr[i]);
  }
}
