import java.util.*;
class spring {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    boolean spring = (m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20);
    System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
  }
}
