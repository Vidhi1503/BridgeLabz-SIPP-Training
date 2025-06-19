package Day5_Methods;

import java.util.*;
public class Young {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3], height = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        int min = 0, max = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[min]) min = i;
            if (height[i] > height[max]) max = i;
        }
        System.out.println("Youngest: " + names[min]);
        System.out.println("Tallest: " + names[max]);
    }
}
