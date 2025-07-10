import java.util.*;
class sort {
    static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insert(s, x);
        }
    }
    static void insert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) s.push(x);
        else {
            int y = s.pop();
            insert(s, x);
            s.push(y);
        }
    }
}
