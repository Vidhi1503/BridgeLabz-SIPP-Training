package Day4_Exceptions;

class MultiCatch {
    public static void main(String[] a) {
        int[] arr=null; int idx=2;
        try {System.out.println("Value at index "+idx+": "+arr[idx]);}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid index!");}
        catch(NullPointerException e){System.out.println("Array is not initialized!");}
    }
}
