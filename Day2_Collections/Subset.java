package Day2_Collections;

import java.util.*;
class Subset {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println(s2.containsAll(s1));
    }
}
