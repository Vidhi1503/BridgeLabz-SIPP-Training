package Day4_Strings;

import java.util.*;

public class str2 {
    static String[] str2Split(String s) {
        List<String> ll = new ArrayList<>();
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!w.isEmpty()) 
                ll.add(w);
                w = "";
            } else 
            w += c;
        }
        if (!w.isEmpty()) 
        ll.add(w);
        return ll.toArray(new String[0]);
    }
    static boolean comparision(String[] a, String[] b) {
        if (a.length != b.length) 
        return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) 
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str2Split(str);
        String[] str3 = str.split(" ");
        System.out.println("Match: " + comparision(str2, str3));
    }
}
