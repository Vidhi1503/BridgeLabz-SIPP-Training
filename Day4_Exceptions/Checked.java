package Day4_Exceptions;

import java.io.*;
class Checked {
    public static void main(String[] a) {
        try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
            String line; 
            while((line=br.readLine())!=null) 
            System.out.println(line);
        } catch(IOException e){
            System.out.println("File not found");
        }
    }
}
