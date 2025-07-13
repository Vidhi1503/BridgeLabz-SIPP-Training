import java.util.*;
public class searching {
    public static void main(String[] args) {
        int[] arr = new Random().ints(1000000, 1, 10000000).toArray();
        int target = arr[500000];

        for (int i : arr) if (i == target) 
        break;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) set.add(i);
        boolean foundHash = set.contains(target);

        Set<Integer> tree = new TreeSet<>();
        for (int i : arr) tree.add(i);
        boolean bool = tree.contains(target);
    }
}
