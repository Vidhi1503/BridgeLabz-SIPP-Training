package Day2_Java_Constructors;

public class person {
    String name;
    int age;
    person(String n, int a) {
        name = n; age = a;
    }
    person(person p) {
        name = p.name; age = p.age;
    }
}
