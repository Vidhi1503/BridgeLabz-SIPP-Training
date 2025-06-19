package Day4_Strings;

import java.util.*;

public class voco {
    static boolean vow(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        return "aeiou".indexOf(c) >= 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch))
                if (vow(ch)) a++;
                else b++;
        }
        System.out.println("Vowels: " + a + ", Consonants: " + b);
    }
}
