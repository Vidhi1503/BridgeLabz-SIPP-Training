package Day6_Annotations;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)@interface ImportantMethod{String level() default "HIGH";}
class Service{@ImportantMethod void m1(){}@ImportantMethod(level="LOW")void m2(){}}
public class ImportantDemo{
 public static void main(String[]a){
  for(var m:Service.class.getDeclaredMethods())
   if(m.isAnnotationPresent(ImportantMethod.class))
    System.out.println(m.getName()+" "+m.getAnnotation(ImportantMethod.class).level());
 }
}
