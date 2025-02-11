package OOP_Concepts;

public class q11_StringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append operation
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert operation
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace operation
        sb.replace(6, 10, "Beautiful");
        System.out.println("After replace: " + sb);

        // Delete operation
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length and capacity of StringBuilder
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
