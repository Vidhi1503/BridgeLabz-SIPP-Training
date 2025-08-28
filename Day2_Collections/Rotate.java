package Day2_Collections;

import java.util.*;
class Rotate {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2,n=list.size(); k%=n;
        List<Integer> res=new ArrayList<>(list.subList(k,n));
        res.addAll(list.subList(0,k));
        System.out.println(res);
    }
}
