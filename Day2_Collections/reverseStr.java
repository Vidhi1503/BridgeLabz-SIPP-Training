package Day2_Collections;

import java.util.*;
class ReverseList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0,j=arr.size()-1;i<j;i++,j--) 
            Collections.swap(arr,i,j);
        System.out.println(arr);

        LinkedList<Integer> ll=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0,j=ll.size()-1;i<j;i++,j--) {
            int t=ll.get(i); ll.set(i,ll.get(j)); ll.set(j,t);
        }
        System.out.println(ll);
    }
}
