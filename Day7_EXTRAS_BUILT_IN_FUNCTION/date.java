package Day7_EXTRAS_BUILT_IN_FUNCTION;

import java.util.*;
public class date {
  public static void main(String[] args) {
    Calendar c1 = Calendar.getInstance();
    c1.set(2023, Calendar.JANUARY, 1);

    Calendar c2 = Calendar.getInstance();
    c2.set(2024, Calendar.JANUARY, 1);

    Date d1 = c1.getTime();
    Date d2 = c2.getTime();

    if (d1.before(d2))
      System.out.println("Before");
    else if (d1.after(d2))
      System.out.println("After");
    else
      System.out.println("Same");
  }
}
