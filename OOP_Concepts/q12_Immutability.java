package OOP_Concepts;
public class q12_Immutability {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1; // Assign the reference of str1 to str2

        System.out.println("Before modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Modify str1
        str1 = str1 + " World";

        System.out.println("\nAfter modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Check if str1 and str2 point to the same object
        System.out.println("\nAre str1 and str2 the same object? " + (str1 == str2));
    }
}
