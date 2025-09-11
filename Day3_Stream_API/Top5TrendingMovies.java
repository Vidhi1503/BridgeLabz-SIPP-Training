package Day3_Stream_API;

import java.util.*;
class Movie{String n;double r;int y;Movie(String n,double r,int y){this.n=n;this.r=r;this.y=y;}}
public class Top5TrendingMovies{
  public static void main(String[]a){
    List<Movie> m=Arrays.asList(new Movie("A",9.2,2024),new Movie("B",8.8,2023),
      new Movie("C",9.5,2025),new Movie("D",8.9,2025),new Movie("E",9.0,2024),new Movie("F",8.7,2025));
    m.stream().sorted(Comparator.comparing((Movie x)->x.r).thenComparing(x->x.y).reversed())
      .limit(5).forEach(x->System.out.println(x.n));
  }
}
