import java.util.*;
class smallest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
    System.out.println("Is the first number the smallest? " + (a < b && a < c));
  }
}
