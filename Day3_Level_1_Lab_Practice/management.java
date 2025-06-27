package Day3_Level_1_Lab_Practice;

public class management {
    static String str = "City Library";
    final String str2;
    String title, author;

    management(String title, String author, String str2) {
        this.title = title;
        this.author = author;
        this.str2 = str2;
    }
    static void display() {
        System.out.println(str);
    }
    void show() {
        if (this instanceof management)
            System.out.println(title + " by " + author + " [str2: " + str2 + "]");
    }
}

