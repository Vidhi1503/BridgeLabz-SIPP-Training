package Day4_Exceptions;

import java.util.*;
class UncheckedEx {
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        try {
            int x=sc.nextInt(),y=sc.nextInt();
            System.out.println("Result: "+(x/y));
        } catch(ArithmeticException e){System.out.println("Division by zero!");}
          catch(InputMismatchException e){System.out.println("Enter numbers only!");}
    }
}
