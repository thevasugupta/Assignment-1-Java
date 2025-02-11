package InheritanceAndOverriding;

class Parent {
    void display() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display(); // Calling the parent class method
        System.out.println("This is the child class method.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
