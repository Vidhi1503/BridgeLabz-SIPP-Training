package Day5_Methods;

import java.util.*;
public class Spring {
    static boolean spr(int m, int d) {
        return (m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();
        System.out.println(spr(m, d) ? "It's a Spring Season" : "Not a Spring Season");
    }
}
