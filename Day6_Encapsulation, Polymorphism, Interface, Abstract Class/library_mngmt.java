abstract class LibraryItem {
    String title;
    void detail() { 
        System.out.println(title); }
    abstract int days();
}
interface Reservable {
    void reserve();
}
class Book extends LibraryItem implements Reservable {
    public int days() { 
        return 14; }
    public void reserve() {}
}
class DVD extends LibraryItem {
    public int days() { 
        return 7; }
}
public class library_mngmt {
    public static void main(String[] args) {
        LibraryItem[] items = { new Book(), new DVD() };
        for (LibraryItem i : items) {
            i.title = "XYZ";
            i.detail();
            System.out.println("Loan: " + i.days());
        }
    }
}
