package Day4_Exceptions;

class Throws {
    static double calculateInterest(double amt,double r,int y)throws IllegalArgumentException{
        if(amt<0||r<0) throw new IllegalArgumentException();
        return amt*r*y/100;
    }
    public static void main(String[] a){
        try{System.out.println(calculateInterest(1000,5,2));}
        catch(IllegalArgumentException e){System.out.println("Invalid input: Amount and rate must be positive");}
    }
}
