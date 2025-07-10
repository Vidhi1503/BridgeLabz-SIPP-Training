package Day1_LinkedList;

class Process {
    int id, bt, pri;
    Process next;
    Process(int i, int b, int p) { id = i; bt = b; pri = p; }
}
class round_robin {
    Process head = null;
    void add(Process p) {
        if (head == null) { head = p; p.next = p; }
        else {
            Process t = head;
            while (t.next != head) t = t.next;
            t.next = p; p.next = head;
        }
    }
    void schedule(int tq) {
        while (head != null) {
            if (head.bt <= tq) { System.out.println("Executed: " + head.id); remove(head.id); }
            else { System.out.println("Processing: " + head.id); head.bt -= tq; head = head.next; }
        }
    }
    void remove(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) { head = null; return; }
        Process prev = head, cur = head.next;
        if (head.id == id) {
            while (cur.next != head) cur = cur.next;
            cur.next = head.next; head = head.next; return;
        }
        while (cur != head && cur.id != id) {
            prev = cur; cur = cur.next;
        }
        if (cur.id == id) prev.next = cur.next;
    }
}
