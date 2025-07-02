package Day5_Inheritance;

class Animal {
    String name;
    int age;
    void sounds() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sounds() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sounds() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    void sounds() {
        System.out.println("Tweet");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Bird() };
        for (Animal a : animals) {
            a.sounds();
        }
    }
}
