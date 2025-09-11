package Day2_Functional_Interfaces;

import java.util.function.*;
public class StringLengthChecker {
    public static void main(String[]a){
        Function<String,Integer> len=String::length;
        System.out.println(len.apply("Hello World"));
    }
}
