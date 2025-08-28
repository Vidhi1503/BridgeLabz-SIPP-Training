package Day3_Java_Streams;

import java.io.*;
class Piped {
    public static void main(String[] a)throws Exception {
        PipedOutputStream pos=new PipedOutputStream();
        try (PipedInputStream pis = new PipedInputStream(pos)) {
            new Thread(()->{try{pos.write("Hello Vidhi".getBytes());pos.close();}catch(Exception e){}}).start();
            new Thread(()->{try{int x;while((x=pis.read())!=-1)System.out.print((char)x);}catch(Exception e){}}).start();
        }
    }
}
