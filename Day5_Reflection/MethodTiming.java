package Day5_Reflection;

import java.lang.reflect.*;
class Worker{public void work(){for(int i=0;i<1e6;i++);}}
public class MethodTiming{
  public static void main(String[]a)throws Exception{
    Worker w=new Worker();Method m=Worker.class.getMethod("work");
    long t=System.nanoTime();m.invoke(w);
    System.out.println("Time:"+(System.nanoTime()-t));
  }
}
