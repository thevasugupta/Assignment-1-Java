package ControlStatements;
import java.util.Scanner;

public class q16_Factorial {
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user for a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Validate input (factorial is defined for non-negative integers)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Output: Calculate and display the factorial
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}
