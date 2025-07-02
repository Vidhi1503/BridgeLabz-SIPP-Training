package Day5_Inheritance;

class Book {
    String title;
    int publicationYear;
}
class Author extends Book {
    String name, bio;
    void infor() {
        System.out.println(title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + " - " + bio);
    }
}
public class Library_mngnt {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics"; a.publicationYear = 2020;
        a.name = "John"; a.bio = "Tech Author";
        a.infor();
    }
}
