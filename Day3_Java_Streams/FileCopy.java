package Day3_Java_Streams;

import java.io.*;
class FileCopy {
    public static void main(String[] a) {
        try(FileInputStream in=new FileInputStream("src.txt");
            FileOutputStream out=new FileOutputStream("dest.txt")) {
            int c; while((c=in.read())!=-1) out.write(c);
            System.out.println("File copied.");
        } catch(IOException e){System.out.println("Source file missing!");}
    }
}
