package Day7_EXTRAS_BUILT_IN_FUNCTION;

import java.util.*;
public class DateArith {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    cal.set(2022, Calendar.JANUARY, 1);
    cal.add(Calendar.DAY_OF_MONTH, 7);
    cal.add(Calendar.MONTH, 1);
    cal.add(Calendar.YEAR, 2);
    cal.add(Calendar.WEEK_OF_YEAR, -3);

    System.out.println("Updated Date: " + cal.getTime());
  }
}
