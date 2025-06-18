package Day3_Arrays;

import java.util.*;
class digit_limit {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(), i = 0;
    int[] d = new int[10];
    while (n > 0 && i < 10) {
      d[i++] = n % 10;
      n /= 10;
    }
    int max = -1, sec = -1;
    for (int j = 0; j < i; j++) {
      if (d[j] > max) { sec = max; max = d[j]; }
      else if 
      (d[j] > sec && d[j] != max) sec = d[j];
    }
    System.out.println("Max: " + max + ", Second: " + sec);
  }
}
