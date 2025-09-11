package Day5_Reflection;

import java.lang.reflect.*;
class Person{
   int age=20;
}
public class AccessPrivateField{
  public static void main(String[]a)throws Exception{
    Person p=new Person();
    Field f=Person.class.getDeclaredField("age");f.setAccessible(true);
    f.set(p,30);System.out.println("Age:"+f.get(p));
  }
}
