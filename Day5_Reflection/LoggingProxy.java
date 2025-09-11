package Day5_Reflection;

import java.lang.reflect.*;
interface Greeting{void sayHello();}
class GreetingImpl implements Greeting{public void sayHello(){System.out.println("Hi");}}
public class LoggingProxy{
  public static void main(String[]a){
    Greeting g=(Greeting)Proxy.newProxyInstance(Greeting.class.getClassLoader(),
      new Class[]{Greeting.class},(p,m,args)->{System.out.println("Called:"+m.getName());return m.invoke(new GreetingImpl(),args);});
    g.sayHello();
  }
}
