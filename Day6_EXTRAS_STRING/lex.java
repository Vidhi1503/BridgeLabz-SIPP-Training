package Day6_EXTRAS_STRING;

public class lex { 
  public static void main(String[] a) {
    String s1 = "apple";
    String s2 = "banana";
    System.out.println(s1.equals(s2) ? "Equal" : (s1.compareTo(s2) < 0 ? s1 + " comes first" : s2 + " comes first"));
  }
}


