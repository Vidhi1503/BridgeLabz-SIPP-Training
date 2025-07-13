import java.util.*;
public class search {
    public static void main(String[] args) {
        int[] data = new Random().ints(1000000, 1, 10000000).toArray();
        int target = data[data.length / 2];
        for (int i : data) if (i == target) break;

        Arrays.sort(data);
    }
}
