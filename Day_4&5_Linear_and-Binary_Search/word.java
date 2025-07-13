public class word {
    public static void main(String[] args) {
        String[] str = {"Java is fun", "I love coding", "Hello world"};
        String word = "love";
        for (String s : str)
            if (s.contains(word)) {
                System.out.println(s);
                return;
            }
        System.out.println("Not Found");
    }
}
