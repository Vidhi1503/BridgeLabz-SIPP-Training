package Day3_Java_Streams;

import java.io.*;
class DataStreamDemo {
    public static void main(String[] a)throws Exception {
        try(DataOutputStream out=new DataOutputStream(new FileOutputStream("student.dat"))){
            out.writeInt(101); out.writeUTF("Vidhi"); out.writeDouble(9.1);
        }
        try(DataInputStream in=new DataInputStream(new FileInputStream("student.dat"))){
            System.out.println(in.readInt()+" "+in.readUTF()+" "+in.readDouble());
        }
    }
}
