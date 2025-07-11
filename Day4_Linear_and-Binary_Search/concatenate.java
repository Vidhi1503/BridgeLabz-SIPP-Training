public class concatenate {
    public static void main(String[] args) {
        String[] arr = {"Java", "is", "fun"};
        StringBuffer sb = new StringBuffer();
        for (String s : arr) sb.append(s);
        System.out.println(sb);
    }
}

