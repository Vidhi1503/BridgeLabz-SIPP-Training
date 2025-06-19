package Day5_Methods;

import java.util.*;
public class MaxHandshakes {
    static int handshakes(int n) {
        return n * (n - 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Max handshakes: " + handshakes(n));
    }
}
