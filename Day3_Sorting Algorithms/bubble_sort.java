public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {60, 45, 90, 70, 50};
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        for (int m : arr) System.out.print(m + " ");
    }
}
