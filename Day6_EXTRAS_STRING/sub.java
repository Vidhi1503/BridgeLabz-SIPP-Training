package Day6_EXTRAS_STRING;

class sub {
  public static void main(String[] a) {
    String s = "ababab", sub = "ab";
    int c = 0;
    for (int i = 0; i <= s.length() - sub.length(); i++)
      if (s.substring(i, i + sub.length()).equals(sub)) c++;
    System.out.println("Count: " + c);
  }
}
