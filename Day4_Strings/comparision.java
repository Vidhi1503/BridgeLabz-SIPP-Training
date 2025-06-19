package Day4_Strings;

import java.util.*;

public class comparision {
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        boolean bo1 = compare(str1, str2);
        boolean bo2 = str1.equals(str2);
        System.out.println("Match by charAt: " + bo1 + ", Built-in equals: " + bo2);
    }
}
