package Day2_Collections;

import java.util.*;
class SymDiff {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
        Set<Integer> sd=new HashSet<>(s1); sd.addAll(s2);
        Set<Integer> tmp=new HashSet<>(s1); tmp.retainAll(s2);
        sd.removeAll(tmp);
        System.out.println(sd);
    }
}
