package Day4_Strings;

import java.util.*;

public class char_extract {
    static char[] extract(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        return arr;
    }

    static boolean comparea(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr1 = extract(str);
        char[] arr2 = str.toCharArray();
        System.out.println("Match: " + comparea(arr1, arr2));
    }
}
