package Day4_Exceptions;

import java.util.*;
class FinallyDemo {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        try {
            int x=sc.nextInt(),y=sc.nextInt();
            System.out.println("Result: "+(x/y));
        } catch(Exception e){System.out.println("Error: "+e);}
        finally{System.out.println("Operation completed");}
    }
}
