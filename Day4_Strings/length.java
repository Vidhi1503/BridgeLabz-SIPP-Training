package Day4_Strings;

import java.util.*;

public class length {
    static int len_str(String s) {
        int cnt = 0;
        for (char ch : s.toCharArray()) 
        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Custom length: " + len_str(str));
        System.out.println("Built-in length: " + str.length());
    }
}
