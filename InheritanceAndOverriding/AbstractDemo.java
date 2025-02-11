package InheritanceAndOverriding;

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Overridden method
        dog.eat();   // Concrete method from abstract class
    }
}
