import java.io.*;

public class input {    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        String line;
        while (!(line = br.readLine()).equals("exit"))
            bw.write(line + "\n");
        bw.close();
    }
}

