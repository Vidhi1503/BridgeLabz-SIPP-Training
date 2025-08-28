package Day3_Java_Streams;
import java.io.*;
class UserInput {
    public static void main(String[] a)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: "); String n=br.readLine();
        System.out.print("Age: "); String age=br.readLine();
        System.out.print("Lang: "); String lang=br.readLine();
        try(FileWriter fw=new FileWriter("user.txt")){
            fw.write(n+" "+age+" "+lang);
        }
        System.out.println("Saved.");
    }
}
