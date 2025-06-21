package Day6_EXTRAS_STRING;

class word {
  public static void main(String[] a) {
    String[] w = "Java is amazing".split(" ");
    String max = "";
    for (String s : w) if (s.length() > max.length()) max = s;
    System.out.println(max);
  }
}
