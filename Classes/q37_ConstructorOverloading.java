package Classes;

class Rectangle {
    int length;
    int width;

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Constructor with one parameter (square)
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters (rectangle)
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Calculate area
    public int getArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + getArea());
    }
}

public class q37_ConstructorOverloading {
    public static void main(String[] args) {
        // Default constructor
        Rectangle rect1 = new Rectangle();
        rect1.display();

        // Constructor with one parameter
        Rectangle rect2 = new Rectangle(5);
        rect2.display();

        // Constructor with two parameters
        Rectangle rect3 = new Rectangle(4, 7);
        rect3.display();
    }
}
