import java.util.*;
public class remove_dupli {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray())
            if (set.add(c)) sb.append(c);
        System.out.println(sb);
    }
}
