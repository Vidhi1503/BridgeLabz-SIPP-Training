package Day5_Inheritance;
class Person {
    String name;
    int id;
}

interface Worker {
    void duty();
}

class Chef extends Person implements Worker {
    public void duty() {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker {
    public void duty() {
        System.out.println("Waiter serves food");
    }
}

public class rest_mngmt {
    public static void main(String[] args) {
        new Chef().duty();
        new Waiter().duty();
    }
}
