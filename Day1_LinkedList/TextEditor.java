package Day1_LinkedList;

class State {
    String text;
    State prev, next;
    State(String t) { text = t; }
}
class TextEditor {
    State curr;
    void type(String t) {
        State s = new State(t);
        if (curr != null) curr.next = s; s.prev = curr;
        curr = s;
    }
    void undo() { if (curr != null && curr.prev != null) curr = curr.prev; }
    void redo() { if (curr != null && curr.next != null) curr = curr.next; }
    void show() { System.out.println("curr: " + (curr != null ? curr.text : "")); }
}
