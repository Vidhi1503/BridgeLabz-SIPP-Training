package Day2_Collections;

import java.util.*;
class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n=2;
        var p1=list.listIterator();
        var p2=list.listIterator();
        for(int i=0;i<n;i++) p2.next();
        while(p2.hasNext()){p1.next();p2.next();}
        System.out.println(p1.next());
    }
}
