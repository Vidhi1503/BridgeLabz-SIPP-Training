package Day6_Annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)@interface RoleAllowed{String value();}
class AdminPanel{@RoleAllowed("ADMIN")void secret(){System.out.println("Access");}}
public class RoleDemo{
 public static void main(String[]a)throws Exception{
  String role="USER";var m=AdminPanel.class.getMethod("secret");
  if(m.getAnnotation(RoleAllowed.class).value().equals(role))m.invoke(new AdminPanel());
  else System.out.println("Access Denied!");
 }
}
