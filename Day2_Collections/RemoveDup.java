package Day2_Collections;

import java.util.*;
class RemoveDup {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,1,2,2,3,4);
        Set<Integer> seen=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int x:list) if(seen.add(x)) res.add(x);
        System.out.println(res);
    }
}
