package Day7_EXTRAS_BUILT_IN_FUNCTION;

import java.util.*;
import java.text.*;
public class DateFormat {
  public static void main(String[] args) {
    Date date = new Date();

    SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat f3 = new SimpleDateFormat("EEE, MMM dd, yyyy");

    System.out.println(f1.format(date));
    System.out.println(f2.format(date));
    System.out.println(f3.format(date));
  }
}
