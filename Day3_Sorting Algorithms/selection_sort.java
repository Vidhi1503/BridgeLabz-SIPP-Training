public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {78, 55, 90, 62, 80};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int t = arr[i]; arr[i] = arr[min]; arr[min] = t;
        }
        for (int s : arr) System.out.print(s + " ");
    }
}
