package Day7_EXTRAS_BUILT_IN_FUNCTION;

import java.util.*;

public class TimeZones {
  public static void main(String[] args) {
    Date now = new Date();
    printTimeForZone("GMT", now);
    printTimeForZone("Asia/Kolkata", now);
    printTimeForZone("America/Los_Angeles", now);
  }

  static void printTimeForZone(String zoneId, Date date) {
    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(zoneId));
    cal.setTime(date);
    System.out.println(zoneId + ": " + cal.getTime());
  }
}
