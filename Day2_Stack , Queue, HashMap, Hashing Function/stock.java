import java.util.*;
class stock {
    static int[] calculate(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            arr2[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return arr2;
    }
}
