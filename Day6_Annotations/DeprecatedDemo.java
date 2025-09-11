package Day6_Annotations;

class LegacyAPI{
 @Deprecated void oldFeature(){System.out.println("Old");}
 void newFeature(){System.out.println("New");}
}
public class DeprecatedDemo{
 public static void main(String[]a){
   LegacyAPI api=new LegacyAPI();api.oldFeature();api.newFeature();
 }
}
