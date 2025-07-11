public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {103, 101, 105, 102, 104};
        for (int i = 1; i < arr.length; i++) {
            int n = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > n)
                arr[j + 1] = arr[j--];
            arr[j + 1] = n;
        }
        for (int id : arr) System.out.print(id + " ");
    }
}

