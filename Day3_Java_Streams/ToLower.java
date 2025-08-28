package Day3_Java_Streams;

import java.io.*;
class ToLower {
    public static void main(String[] a)throws Exception {
        try(BufferedReader br=new BufferedReader(new FileReader("in.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt"))){
            String line; 
            while((line=br.readLine())!=null) bw.write(line.toLowerCase()+"\n");
        }
        System.out.println("Converted.");
    }
}
