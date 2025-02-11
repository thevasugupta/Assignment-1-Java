package Operators;
public class StringComparison {
    public static void main(String[] args) {
        // Using string literals
        String str1 = "Hello";
        String str2 = "Hello";

        // Using new String object
        String str3 = new String("Hello");

        // Comparing strings using ==
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        // Comparing strings using equals()
        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
    }
}
