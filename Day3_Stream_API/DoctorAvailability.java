package Day3_Stream_API;

import java.util.*;
class Doctor{String n,s;boolean w;Doctor(String n,String s,boolean w){this.n=n;this.s=s;this.w=w;}}
public class DoctorAvailability{
  public static void main(String[]a){
    List<Doctor>d=Arrays.asList(new Doctor("A","Cardio",true),new Doctor("B","Neuro",false),
      new Doctor("C","Ortho",true));
    d.stream().filter(x->x.w).sorted(Comparator.comparing(x->x.s))
      .forEach(x->System.out.println(x.n+"-"+x.s));
  }
}
