package Day5_Methods;

import java.util.*;
public class Leap {
    static boolean isLeap(int y) {
        return y >= 1582 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(isLeap(y) ? "Leap Year" : "Not a Leap Year");
    }
}
