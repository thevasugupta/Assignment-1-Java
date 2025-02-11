package StringClassOperations;
public class ReverseString {
    public static void main(String[] args) {
        String input = "HelloWorld";
        char[] chars = input.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
