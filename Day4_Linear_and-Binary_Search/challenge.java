import java.util.*;
public class challenge {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        Set<Integer> set = new HashSet<>();
        for (int n : arr) if (n > 0) set.add(n);
        int i = 1;
        while (true) {
            if (!set.contains(i)) { System.out.println("Missing: " + i); break; }
            i++;
        }
        Arrays.sort(arr);
        int t = 1, l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == t) { System.out.println("Index: " + m); return; }
            if (arr[m] < t) l = m + 1; else r = m - 1;
        }
        System.out.println("Not Found");
    }
}
