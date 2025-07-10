import java.util.*;
class zero_sum {
    static void find(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>(List.of(-1)));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum))
                    System.out.println("Subarray: " + (start + 1) + " to " + i);
            }
            map.computeIfAbsent(sum, x -> new ArrayList<>()).add(i);
        }
    }
}
