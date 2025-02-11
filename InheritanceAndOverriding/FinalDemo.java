package InheritanceAndOverriding;

// Final class example
final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class and cannot be inherited.");
    }
}

// Final method example
class ParentClass {
    final void display() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class ChildClass extends ParentClass {
    // Attempting to override display() would result in a compilation error
    void showChildMessage() {
        System.out.println("This is a method in the child class.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass finalClassInstance = new FinalClass();
        finalClassInstance.showMessage();

        ChildClass childInstance = new ChildClass();
        childInstance.display(); // Calls final method from ParentClass
        childInstance.showChildMessage();
    }
}
