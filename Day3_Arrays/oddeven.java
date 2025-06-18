package Day3_Arrays;

import java.util.*;
class oddeven {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    if (n < 1) { System.out.println("Invalid"); return; }
    int[] odd = new int[n/2+1], even = new int[n/2+1];
    int oi = 0, ei = 0;
    for (int i = 1; i <= n; i++)
      if (i % 2 == 0) even[ei++] = i; else odd[oi++] = i;
    System.out.println("Odd: " + Arrays.toString(Arrays.copyOf(odd, oi)));
    System.out.println("Even: " + Arrays.toString(Arrays.copyOf(even, ei)));
  }
}
