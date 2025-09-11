package Day3_Stream_API;

import java.util.*;
public class TransformNames{
  public static void main(String[]a){
    List<String>n=Arrays.asList("vidhi","kiran","amit");
    n.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
  }
}
