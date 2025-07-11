public class matrix {
    public static void main(String[] args) {
        int[][] m = {{1,3,5},{7,9,11},{13,15,17}};
        int t = 9, r = m.length, c = m[0].length;
        int l = 0, h = r * c - 1;
        while (l <= h) {
            int mid = (l + h) / 2, val = m[mid / c][mid % c];
            if (val == t) { System.out.println("Found"); return; }
            if (val < t) l = mid + 1; else h = mid - 1;
        }
        System.out.println("Not Found");
    }
}

