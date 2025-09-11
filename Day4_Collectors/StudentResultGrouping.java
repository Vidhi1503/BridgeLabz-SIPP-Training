package Day4_Collectors;

import java.util.*;import java.util.stream.*;
class Student{String name,grade;Student(String n,String g){name=n;grade=g;}}
public class StudentResultGrouping{
  public static void main(String[]a){
    List<Student>s=Arrays.asList(new Student("A","X"),new Student("B","Y"),new Student("C","X"));
    Map<String,List<String>>res=s.stream().collect(Collectors.groupingBy(x->x.grade,Collectors.mapping(x->x.name,Collectors.toList())));
    System.out.println(res);
  }
}
