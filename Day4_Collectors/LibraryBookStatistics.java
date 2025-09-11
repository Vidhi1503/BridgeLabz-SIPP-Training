package Day4_Collectors;

import java.util.*;import java.util.stream.*;
class Book{String g;int p;Book(String g,int p){this.g=g;this.p=p;}}
public class LibraryBookStatistics{
  public static void main(String[]a){
    List<Book>b=Arrays.asList(new Book("Fiction",300),new Book("Fiction",200),new Book("SciFi",400));
    Map<String,IntSummaryStatistics>stats=b.stream().collect(Collectors.groupingBy(x->x.g,Collectors.summarizingInt(x->x.p)));
    System.out.println(stats);
  }
}
