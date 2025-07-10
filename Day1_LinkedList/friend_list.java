package Day1_LinkedList;
import java.util.*;
class User {
    int id, age;
    String name;
    ArrayList<Integer> friends = new ArrayList<>();
    User next;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class friend_list {
    User head;
    void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        u.next = head;
        head = u;
    }
    User search(int id) {
        for (User u = head; u != null; u = u.next)
            if (u.id == id) return u;
        return null;
    }
    void addFriend(int u1, int u2) {
        User a = search(u1), b = search(u2);
        if (a != null && b != null && !a.friends.contains(u2)) {
            a.friends.add(u2);
            b.friends.add(u1);
        }
    }
    void removeFriend(int u1, int u2) {
        User a = search(u1), b = search(u2);
        if (a != null && b != null) {
            a.friends.remove((Integer) u2);
            b.friends.remove((Integer) u1);
        }
    }
    ArrayList<Integer> mutual(int u1, int u2) {
        User a = search(u1), b = search(u2);
        ArrayList<Integer> result = new ArrayList<>();
        if (a == null || b == null) return result;
        for (int f : a.friends)
            if (b.friends.contains(f)) result.add(f);
        return result;
    }
    void display(int id) {
        User u = search(id);
        if (u != null) {
            System.out.print("Friends of " + u.name + ": ");
            for (int f : u.friends)
                System.out.print(f + " ");
            System.out.println();
        }
    }
    void searchByName(String name) {
        for (User u = head; u != null; u = u.next)
            if (u.name.equalsIgnoreCase(name))
                System.out.println("Found: " + u.id + " " + u.name + " " + u.age);
    }
    void countFriends(int id) {
        User u = search(id);
        if (u != null)
            System.out.println(u.name + " has " + u.friends.size() + " friends.");
    }
}
