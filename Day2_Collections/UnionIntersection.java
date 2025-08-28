package Day2_Collections;

import java.util.*;
class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
        Set<Integer> u=new HashSet<>(s1); u.addAll(s2);
        Set<Integer> i=new HashSet<>(s1); i.retainAll(s2);
        System.out.println("Union: "+u+", Intersection: "+i);
    }
}
