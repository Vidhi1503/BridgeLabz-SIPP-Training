import java.io.*;
public class file_read {
    public static void main(String[] args) throws Exception {
        File f = new File("large.txt");

        try (Reader rd = new FileReader(f)) {
            while (rd.read() != -1);
        }

        try (Reader isr = new InputStreamReader(new FileInputStream(f))) {
            while (isr.read() != -1);
        }
    }
}
