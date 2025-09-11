package Day3_Stream_API;

import java.util.*;import java.util.stream.*;
class Claim{String t;double a;Claim(String t,double a){this.t=t;this.a=a;}}
public class ClaimAnalysis{
  public static void main(String[]a){
    List<Claim>c=Arrays.asList(new Claim("Health",1000),new Claim("Auto",2000),new Claim("Health",3000));
    Map<String,Double>avg=c.stream().collect(Collectors.groupingBy(x->x.t,Collectors.averagingDouble(x->x.a)));
    avg.forEach((k,v)->System.out.println(k+":"+v));
  }
}
