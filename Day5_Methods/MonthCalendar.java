package Day5_Methods;

import java.util.*;
public class MonthCalendar {
    static String calender(int m) {
        String[] str = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                          "Aug", "Sep", "Oct", "Nov", "Dec"};
        return str[m - 1];
    }
    static int daycnt(int m, int y) {
        int[] days = {31, y % 4 == 0 && (y % 100 != 0 || y % 400 == 0) ? 29 : 28,
                      31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[m - 1];
    }
    static int start_day(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m)/12) - 2;
        return (d + x + (31 * m0)/12) % 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        System.out.println("\n  " + calender(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = start_day(m, y), days = daycnt(m, y);
        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }
}
