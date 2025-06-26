package Day2_Java_Constructors;

public class vehicle {
    String str, str2;
    static int fees = 5000;

    void detail() {
        System.out.println(str + " " + str2);
    }
    static void res(int fee) {
        fees = fee;
    }
}