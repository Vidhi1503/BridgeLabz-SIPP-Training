package Day3_Arrays;

import java.util.*;
class convert_array{
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int r = s.nextInt(), c = s.nextInt(), idx = 0;
    int[][] m = new int[r][c];
    int[] flat = new int[r * c];
    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++) {
        m[i][j] = s.nextInt();
        flat[idx++] = m[i][j];
      }
    System.out.println(Arrays.toString(flat));
  }
}
