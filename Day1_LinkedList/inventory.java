package Day1_LinkedList;

class Item {
    String name; int id, qty; double price;
    Item next;
    Item(String n, int i, int q, double p) {
        name = n; id = i; qty = q; price = p;
    }
}
class inventory {
    Item head;
    void addLast(Item i) {
        if (head == null) head = i;
        else {
            Item t = head;
            while (t.next != null) t = t.next;
            t.next = i;
        }
    }
    void remove(int id) {
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        Item t = head;
        while (t.next != null && t.next.id != id) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }
    void updateQty(int id, int q) {
        for (Item t = head; t != null; t = t.next)
            if (t.id == id) t.qty = q;
    }
    Item search(int id) {
        for (Item t = head; t != null; t = t.next)
            if (t.id == id) return t;
        return null;
    }
    double totalValue() {
        double sum = 0;
        for (Item t = head; t != null; t = t.next)
            sum += t.qty * t.price;
        return sum;
    }
}
