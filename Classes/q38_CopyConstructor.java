package Classes;

class Student {
    String name;
    int age;

    // Constructor to initialize Student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class q38_CopyConstructor {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Student student1 = new Student("Alice", 20);

        // Creating a copy of student1 using the copy constructor
        Student student2 = new Student(student1);

        // Display the details of both objects
        System.out.println("Original Object:");
        student1.display();

        System.out.println("Copied Object:");
        student2.display();
    }
}

