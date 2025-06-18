package Day3_Arrays;

import java.util.*;
class Q2 {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    double[] h = new double[11];
    double sum = 0;
    for (int i = 0; i < 11; i++) sum += h[i] = s.nextDouble();
    System.out.println("Mean = " + sum / 11);
  }
}
