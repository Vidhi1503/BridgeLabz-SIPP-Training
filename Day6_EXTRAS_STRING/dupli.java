package Day6_EXTRAS_STRING;

class dupli {
  public static void main(String[] a) {
    String s = "hello", r = "";
    for (char c : s.toCharArray())
      if (r.indexOf(c) < 0) r += c;
    System.out.println(r);
  }
}
