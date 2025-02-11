package Operators;
public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        boolean condition1 = true, condition2 = false;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));
    }
}