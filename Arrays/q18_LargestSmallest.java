package Arrays;

import java.util.Scanner;

public class q18_LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0], smallest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
