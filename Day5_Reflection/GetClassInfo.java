package Day5_Reflection;

import java.lang.reflect.*;import java.util.*;
public class GetClassInfo{
  public static void main(String[]a)throws Exception{
    Class<?>c=Class.forName(new Scanner(System.in).next());
    Arrays.stream(c.getDeclaredFields()).forEach(f->System.out.println("Field:"+f));
    Arrays.stream(c.getDeclaredMethods()).forEach(m->System.out.println("Method:"+m));
    Arrays.stream(c.getDeclaredConstructors()).forEach(k->System.out.println("Ctor:"+k));
  }
}
