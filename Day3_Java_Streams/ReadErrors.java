package Day3_Java_Streams;

import java.io.*;
class ReadErrors {
    public static void main(String[] a)throws Exception {
        try(BufferedReader br=new BufferedReader(new FileReader("log.txt"))){
            String line; 
            while((line=br.readLine())!=null)
                if(line.toLowerCase().contains("error")) System.out.println(line);
        }
    }
}
