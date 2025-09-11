package Day2_Functional_Interfaces;

interface UnitConverter {
    static double kmToMiles(double km){return km*0.621;}
    static double kgToLbs(double kg){return kg*2.205;}
}
public class ConversionTool {
    public static void main(String[]a){
        System.out.println(UnitConverter.kmToMiles(5));
        System.out.println(UnitConverter.kgToLbs(10));
    }
}
