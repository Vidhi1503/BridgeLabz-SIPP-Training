import java.util.*;
class voting {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can" : "cannot") + " vote.");
  }
}
