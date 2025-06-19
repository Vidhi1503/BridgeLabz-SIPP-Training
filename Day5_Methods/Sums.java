package Day5_Methods;

import java.util.*;
public class Sums {
    static int res(int n) {
        return (n == 0) ? 0 : n + res(n - 1);
    }
    static int temp(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Recursive Sum: " + res(n));
        System.out.println("Formula Sum: " + temp(n));
    }
}
