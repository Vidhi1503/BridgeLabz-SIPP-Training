package Day2_Java_Constructors;

public class course {
    String str;
    int time;
    double fee;
    static String str2 = "ABC";

    void detail() {
        System.out.println(str + " " + time + " " + fee);
    }
    static void res(String name) {
        str2 = name;
    }
}

