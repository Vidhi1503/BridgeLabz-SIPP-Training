package Day4_Strings;
import java.util.*;
public class vowel_conso {
    static String voco(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) >= 0) 
            return "Vowel";
            else 
            return "Consonant";
        }
        return "Not a Letter";
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c + " - " + voco(c));
        }
    }
}
