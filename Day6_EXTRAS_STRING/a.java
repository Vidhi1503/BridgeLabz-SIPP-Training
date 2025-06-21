package Day6_EXTRAS_STRING;

class Countvoco {
  public static void main(String[] a) {
    String s = "Hello", v = "aeiouAEIOU";
    int voco = 0, cc = 0;
    for (char c : s.toCharArray())
      if (Character.isLetter(c))
        if (v.indexOf(c) >= 0) voco++;
        else cc++;
    System.out.println("Vowels: " + voco + ", Consonants: " + cc);
  }
}
