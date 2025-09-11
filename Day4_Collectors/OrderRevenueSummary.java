package Day4_Collectors;

import java.util.*;import java.util.stream.*;
class Order{String c;double t;Order(String c,double t){this.c=c;this.t=t;}}
public class OrderRevenueSummary{
  public static void main(String[]a){
    List<Order>o=Arrays.asList(new Order("A",100),new Order("B",200),new Order("A",50));
    Map<String,Double>sum=o.stream().collect(Collectors.groupingBy(x->x.c,Collectors.summingDouble(x->x.t)));
    System.out.println(sum);
  }
}
