package Day4_Exceptions;

class Propag {
    static void method1(){int x=10/0;}
    static void method2(){method1();}
    public static void main(String[] a){
        try{method2();}catch(Exception e){System.out.println("Handled exception in main");}
    }
}
