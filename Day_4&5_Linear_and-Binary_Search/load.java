import java.io.*;

public class load {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        int cnt = 0;
        while ((line = br.readLine()) != null)
            for (String w : line.split("\\s+"))
                if (w.equals("hello")) cnt++;
        System.out.println("count: " + cnt);
        br.close();
    }
}
