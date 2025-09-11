package Day4_Collectors;

import java.util.*;import java.util.stream.*;
public class WordFrequencyCounter{
  public static void main(String[]a){
    String p="apple banana apple orange banana apple";
    Map<String,Long>freq=Arrays.stream(p.split(" "))
      .collect(Collectors.groupingBy(x->x,Collectors.counting()));
    System.out.println(freq);
  }
}
