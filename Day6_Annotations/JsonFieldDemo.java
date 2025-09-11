package Day6_Annotations;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)@interface JsonField{String name();}
class U{@JsonField(name="user_name")String uname="Raj";}
public class JsonFieldDemo{
 public static void main(String[]a)throws Exception{
  U u=new U();StringBuilder sb=new StringBuilder("{");
  for(var f:U.class.getDeclaredFields()){var j=f.getAnnotation(JsonField.class);
    sb.append("\""+j.name()+"\":\""+f.get(u)+"\",");}
  System.out.println(sb.deleteCharAt(sb.length()-1)+"}");
 }
}
