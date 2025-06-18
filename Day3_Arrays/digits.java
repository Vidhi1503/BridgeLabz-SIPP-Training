package Day3_Arrays;

import java.util.*;
class digits {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(), i = 0, size = 10;
    int[] d = new int[size];
    while (n > 0) {
      if (i == size) d = Arrays.copyOf(d, size *= 2);
      d[i++] = n % 10;
      n /= 10;
    }
    int max = -1, second = -1;
    for (int j = 0; j < i; j++) {
      if (d[j] > max) { second = max; max = d[j]; }
      else if (d[j] > second && d[j] != max) second = d[j];
    }
    System.out.println("Max: " + max + ", Second: " + second);
  }
}
