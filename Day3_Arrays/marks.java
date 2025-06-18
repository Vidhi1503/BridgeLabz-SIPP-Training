package Day3_Arrays;

import java.util.*;
class marks {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    double[] pct = new double[n];
    char[] grade = new char[n];
    int[][] m = new int[n][3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        m[i][j] = s.nextInt();
        if (m[i][j] < 0) { j--; continue; }
      }
      pct[i] = (m[i][0] + m[i][1] + m[i][2]) / 3.0;
      grade[i] = pct[i] >= 90 ? 'A' : (pct[i] >= 75 ? 'B' : (pct[i] >= 60 ? 'C' : 'D'));
    }
    for (int i = 0; i < n; i++)
      System.out.println(Arrays.toString(m[i]) + " " + pct[i] + " " + grade[i]);
  }
}
