public class Fibonacci {
    static int fibo_recur(int n) {
        if (n <= 1) return n;
        return fibo_recur(n-1) + fibo_recur(n-2);
    }

    static int fibo_iterate(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b; b = sum;
        }
        return n == 0 ? 0 : b;
    }

    public static void main(String[] args) {
        System.out.println(fibo_recur(10));
        System.out.println(fibo_iterate(50));
    }
}
