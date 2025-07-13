public class StringConcat {
    public static void main(String[] args) {
        int N = 100000;
        String s = "";
        for (int i = 0; i < N; i++) s += "a";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("a");

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) sbf.append("a");
    }
}
