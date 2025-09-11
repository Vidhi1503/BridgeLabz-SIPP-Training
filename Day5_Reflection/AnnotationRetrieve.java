package Day5_Reflection;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)@interface Author{String name();}
@Author(name="Alice")class Book{}
public class AnnotationRetrieve{
  public static void main(String[]a){
    Author auth=Book.class.getAnnotation(Author.class);
    System.out.println(auth.name());
  }
}
