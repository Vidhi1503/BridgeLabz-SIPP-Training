package Day2_Collections;

import java.util.*;
class SortedList {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(Arrays.asList(5,3,9,1));
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
