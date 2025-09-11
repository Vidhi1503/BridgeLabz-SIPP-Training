package Day3_Stream_API;

import java.util.*;import java.util.stream.*;
public class SensorReadings{
  public static void main(String[]a){
    List<Integer>r=Arrays.asList(45,70,30,90);
    r.stream().filter(x->x>50).forEach(System.out::println);
  }
}
