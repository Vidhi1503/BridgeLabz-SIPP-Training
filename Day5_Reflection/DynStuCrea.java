package Day5_Reflection;

class Student{String name="John";}
public class DynStuCrea{
  public static void main(String[]a)throws Exception{
    Object s=Class.forName("Student").getDeclaredConstructor().newInstance();
    System.out.println(((Student)s).name);
  }
}
