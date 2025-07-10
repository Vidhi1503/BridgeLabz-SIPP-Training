package Day1_LinkedList;

class Task {
    int id; String name; int pri; String date;
    Task next;
    Task(int i, String n, int p, String d) {
        id = i; name = n; pri = p; date = d;
    }
}
class TaskList {
    Task head = null;
    void addLast(Task t) {
        if (head == null) { head = t; t.next = t; }
        else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t; t.next = head;
        }
    }
    void remove(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) { head = null; return; }
        Task prev = head, cur = head.next;
        if (head.id == id) {
            while (cur.next != head) cur = cur.next;
            cur.next = head.next; head = head.next;
            return;
        }
        while (cur != head && cur.id != id) {
            prev = cur; cur = cur.next;
        }
        if (cur.id == id) prev.next = cur.next;
    }
    Task current = null;
    void nextTask() {
        if (current == null) current = head;
        else current = current.next;
        System.out.println("Current: " + current.name);
    }
    void display() {
        if (head == null) return;
        Task t = head;
        do {
            System.out.println(t.id + " " + t.name + " " + t.pri + " " + t.date);
            t = t.next;
        } while (t != head);
    }
}
