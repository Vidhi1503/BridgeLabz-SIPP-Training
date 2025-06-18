package Day3_Arrays;

import java.util.*;
class array_limit {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    double[] d = new double[10];
    int i = 0;
    while (i < 10) {
      double x = s.nextDouble();
      if (x <= 0) break;
      d[i++] = x;
    }
    double sum = 0;
    for (int j = 0; j < i; j++) sum += d[j];
    System.out.println("Total = " + sum);
  }
}
