package Day6_Annotations;

class Animal {void makeSound(){System.out.println("Animal sound");}}
class Dog extends Animal {@Override void makeSound(){System.out.println("Bark");}}
public class OverrideDemo{public static void main(String[]a){new Dog().makeSound();}}
