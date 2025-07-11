public class heap_sort {
    public static void main(String[] args) {
        int[] arr1 = {30000, 50000, 25000, 40000, 35000};
        int n = arr1.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr1, n, i);
        for (int i = n - 1; i > 0; i--) {
            int t = arr1[0]; arr1[0] = arr1[i]; arr1[i] = t;
            heapify(arr1, i, 0);
        }
        for (int s : arr1) System.out.print(s + " ");
    }
    static void heapify(int[] a, int n, int i) {
        int l = 2 * i + 1, r = 2 * i + 2, max = i;
        if (l < n && a[l] > a[max]) max = l;
        if (r < n && a[r] > a[max]) max = r;
        if (max != i) {
            int t = a[i]; a[i] = a[max]; a[max] = t;
            heapify(a, n, max);
        }
    }
}

