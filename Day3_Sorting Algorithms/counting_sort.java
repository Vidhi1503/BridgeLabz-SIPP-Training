public class counting_sort {
    public static void main(String[] args) {
        int[] ages = {12, 14, 10, 11, 13, 12, 15};
        int[] count = new int[19];
        for (int age : ages) count[age]++;
        for (int i = 10; i <= 18; i++)
            while (count[i]-- > 0) System.out.print(i + " ");
    }
}

