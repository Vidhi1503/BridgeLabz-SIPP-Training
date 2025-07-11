public class quick_sort {
    public static void main(String[] args) {
        int[] arr1 = {500, 200, 300, 100, 400};
        quickSort(arr1, 0, arr1.length - 1);
        for (int p : arr1) System.out.print(p + " ");
    }
    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1); quickSort(a, pi + 1, high);
        }
    }
    static int partition(int[] a, int low, int high) {
        int res = a[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (a[j] < res) {
                int t = a[++i]; a[i] = a[j]; a[j] = t;
            }
        int t = a[i + 1]; a[i + 1] = a[high]; a[high] = t;
        return i + 1;
    }
}

