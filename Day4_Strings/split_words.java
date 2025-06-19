package Day4_Strings;

import java.util.*;

public class split_words {
    static String[] splitWord(String text) {
        List<String> str2 = new ArrayList<>();
        String w = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!w.isEmpty()) 
                str2.add(w);
                w = "";
            } else 
            w += c;
        }
        if (!w.isEmpty()) 
        str2.add(w);
        return str2.toArray(new String[0]);
    }

    static int leng(String s) {
        int len = 0;
        for (char c : s.toCharArray()) len++;
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] str2 = splitWord(str1);
        String str3 = str2[0], longest = str2[0];
        for (String w : str2) {
            if (leng(w) < leng(str3)) str3 = w;
            if (leng(w) > leng(longest)) longest = w;
        }
        System.out.println("str3: " + str3 + ", Longest: " + longest);
    }
}
