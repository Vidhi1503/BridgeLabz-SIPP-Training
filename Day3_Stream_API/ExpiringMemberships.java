package Day3_Stream_API;

import java.util.*;import java.time.*;
class Member{String n;LocalDate e;Member(String n,LocalDate e){this.n=n;this.e=e;}}
public class ExpiringMemberships{
  public static void main(String[]a){
    List<Member>m=Arrays.asList(new Member("A",LocalDate.now().plusDays(10)),
      new Member("B",LocalDate.now().plusDays(40)));
    m.stream().filter(x->x.e.isBefore(LocalDate.now().plusDays(30)))
      .forEach(x->System.out.println(x.n));
  }
}
