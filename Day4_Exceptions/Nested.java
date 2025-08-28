package Day4_Exceptions;

class Nested {
    public static void main(String[] a) {
        int[] arr={10,20,30}; int idx=1,div=0;
        try {
            try {System.out.println(arr[idx]/div);}
            catch(ArithmeticException e){System.out.println("Cannot divide by zero!");}
        } catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid array index!");}
    }
}
