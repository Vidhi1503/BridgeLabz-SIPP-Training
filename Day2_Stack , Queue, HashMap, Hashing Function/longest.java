import java.util.*;
class longest{
    static int res(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int len = 1;
                while (set.contains(n + len)) len++;
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
