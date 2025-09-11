package Day6_Annotations;
import java.util.*;
public class SuppressWarningDemo{
 @SuppressWarnings("unchecked")
 public static void main(String[]a){
   ArrayList list=new ArrayList();list.add("Hi");
   System.out.println(list.get(0));
 }
}

