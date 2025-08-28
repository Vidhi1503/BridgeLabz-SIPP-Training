package Day3_Java_Streams;

import java.io.*; 
import java.util.*;
class Employee implements Serializable{
    int id; String name,dept; double sal;
    Employee(int i,String n,String d,double s){id=i;name=n;dept=d;sal=s;}
    public String toString(){return id+" "+name+" "+dept+" "+sal;}
}
class SerializeDemo {
    public static void main(String[] a)throws Exception {
        List<Employee> list=Arrays.asList(
            new Employee(1,"Vidhi","CS",50000),
            new Employee(2,"Rohit","IT",60000));
        try(ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("emp.dat"))){
            o.writeObject(list);
        }
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.dat"))){
            System.out.println((List<Employee>)in.readObject());
        }
    }
}
