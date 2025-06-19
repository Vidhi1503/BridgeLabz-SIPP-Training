package Day5_Methods;

import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] fact = new int[count];
        int sum = 0, product = 1, sumSq = 0, idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                fact[idx++] = i;
                sum += i;
                product *= i;
                sumSq += i * i;
            }
        System.out.println("fact: " + Arrays.toString(fact));
        System.out.println("Sum: " + sum + ", Product: " + product + ", Sum of Squares: " + sumSq);
    }
}
