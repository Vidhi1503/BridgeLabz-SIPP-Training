package Day1_LinkedList;

class Student {
    int roll; String name; int age; char grade;
    Student next;
    Student(int r, String n, int a, char g) {
        roll = r; name = n; age = a; grade = g;
    }
}
class Students {
    Student head;
    void addFirst(Student s) { s.next = head; head = s; }
    void addLast(Student s) {
        if (head == null) head = s;
        else {
            Student t = head;
            while (t.next != null) t = t.next;
            t.next = s;
        }
    }
    void delete(int roll) {
        if (head == null) return;
        if (head.roll == roll) { head = head.next; return; }
        Student t = head;
        while (t.next != null && t.next.roll != roll) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }
    Student search(int roll) {
        for (Student t = head; t != null; t = t.next)
            if (t.roll == roll) return t;
        return null;
    }
    void updateGrade(int roll, char g) {
        Student s = search(roll);
        if (s != null) s.grade = g;
    }
    void display() {
        for (Student t = head; t != null; t = t.next)
            System.out.println(t.roll + " " + t.name + " " + t.age + " " + t.grade);
    }
}
