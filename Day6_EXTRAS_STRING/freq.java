package Day6_EXTRAS_STRING;

public class freq {
  public static void main(String[] a) {
    String s = "success";
    int[] arr = new int[256];
    for (char c : s.toCharArray()) 
    arr[c]++;
    char maxi = ' ';
    for (char c : s.toCharArray())
      if (arr[c] > arr[maxi]) maxi = c;
    System.out.println("Most Frequent: " + maxi);
  }
}
