package Day1_LinkedList;
class Ticket {
    int id; String cname, mname, seat, time;
    Ticket next;
    Ticket(int i, String c, String m, String s, String t) {
        id = i; cname = c; mname = m; seat = s; time = t;
    }
}
class ticket_reserve {
    Ticket head = null;
    void add(Ticket t) {
        if (head == null) { head = t; t.next = t; }
        else {
            Ticket temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t; t.next = head;
        }
    }
    void remove(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) { head = null; return; }
        Ticket prev = head, cur = head.next;
        if (head.id == id) {
            while (cur.next != head) cur = cur.next;
            cur.next = head.next; head = head.next; return;
        }
        while (cur != head && cur.id != id) {
            prev = cur; cur = cur.next;
        }
        if (cur.id == id) prev.next = cur.next;
    }
    void display() {
        if (head == null) return;
        Ticket t = head;
        do {
            System.out.println(t.id + " " + t.cname + " " + t.mname);
            t = t.next;
        } while (t != head);
    }
}

