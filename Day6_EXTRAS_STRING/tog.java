package Day6_EXTRAS_STRING;

class tog {
  public static void main(String[] a) {
    String s = "HeLLo", r = "";
    for (char c : s.toCharArray())
      r += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    System.out.println(r);
  }
}
