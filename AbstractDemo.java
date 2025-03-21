import java.util.*;
abstract class Animal {
    public abstract void sound();
    public void eat(){
        System.out.println("this animal is eating");
    } 
}

class Dog extends Animal {
    public void sound() {
        System.out.println("the dog barks");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("the Cat meows");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        Animal Cat = new Cat();
        Cat.sound();
        Cat.eat();
    }
}