package Day4_Exceptions;

import java.io.*;
class tryWith {
    public static void main(String[] a) {
        try(BufferedReader br=new BufferedReader(new FileReader("info.txt"))){
            System.out.println(br.readLine());
        } catch(IOException e){System.out.println("Error reading file");}
    }
}
