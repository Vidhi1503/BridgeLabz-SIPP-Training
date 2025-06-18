package Day3_Arrays;

import java.util.*;
class reverse {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(), i = 0, temp = n;
    int[] d = new int[10];
    while (temp > 0) {
      d[i++] = temp % 10;
      temp /= 10;
    }
    for (int j = 0; j < i; j++) System.out.print(d[j]);
  }
}
