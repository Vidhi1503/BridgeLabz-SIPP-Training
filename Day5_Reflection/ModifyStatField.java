package Day5_Reflection;

import java.lang.reflect.*;
class Configuration{
   String API_KEY="OLD";}
public class ModifyStatField{
  public static void main(String[]a)throws Exception{
    Field f=Configuration.class.getDeclaredField("API_KEY");
    f.setAccessible(true);f.set(null,"NEW_KEY");
    System.out.println(f.get(null));
  }
}
