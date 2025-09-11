package Day5_Reflection;

import java.lang.reflect.*;class Emp{public String n="Raj";public int s=500;}
public class JsonGenerator{
  public static void main(String[]a)throws Exception{
    Emp e=new Emp();StringBuilder sb=new StringBuilder("{");
    for(Field f:e.getClass().getFields())sb.append("\""+f.getName()+"\":\""+f.get(e)+"\",");
    System.out.println(sb.deleteCharAt(sb.length()-1)+"}");
  }
}
