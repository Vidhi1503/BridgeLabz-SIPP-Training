public class neg_no {
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 7};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) {
                System.out.println(i);
                return;
            }
        System.out.println(-1);
    }
}
