package Day6_Annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)@interface LogExecutionTime{}
class Worker{@LogExecutionTime void heavy(){for(int i=0;i<1e6;i++);} }
public class LogTimeDemo{
 public static void main(String[]a)throws Exception{
  Worker w=new Worker();var m=w.getClass().getMethod("heavy");
  long t=System.nanoTime();m.invoke(w);System.out.println((System.nanoTime()-t));
 }
}
