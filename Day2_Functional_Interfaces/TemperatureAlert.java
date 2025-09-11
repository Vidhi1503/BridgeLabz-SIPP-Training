package Day2_Functional_Interfaces;

import java.util.function.*;
public class TemperatureAlert {
    public static void main(String[]a){
        Predicate<Double> alert=t->t>40;
        System.out.println(alert.test(42.0)?"Alert!":"Safe");
    }
}
