package Day6_EXTRAS_STRING;

class PalCheck {
  public static void main(String[] a) {
    String s = "madam", r = "";
    for (int i = s.length() - 1; i >= 0; i--) r += s.charAt(i);
    System.out.println(s.equals(r) ? "Palindrome" : "Not");
  }
}
