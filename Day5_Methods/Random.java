package Day5_Methods;

import java.util.*;
public class Random {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0, min = 9999;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
            sum += arr[i];
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Avg: " + (sum / 5.0) + ", Min: " + min + ", Max: " + max);
    }
}
