public class merge_sort {
    public static void main(String[] args) {
        int[] arr1 = {300, 150, 500, 200, 100};
        mergeSort(arr1, 0, arr1.length - 1);
        for (int p : arr1) System.out.print(p + " ");
    }
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m); mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    static void merge(int[] a, int l, int m, int r) {
        int[] b = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r)
            b[k++] = a[i] < a[j] ? a[i++] : a[j++];
        while (i <= m) b[k++] = a[i++];
        while (j <= r) b[k++] = a[j++];
        System.arraycopy(b, 0, a, l, b.length);
    }
}

