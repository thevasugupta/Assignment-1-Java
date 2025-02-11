package ControlStatements;

import java.util.Scanner;

public class q15_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num<=1) isPrime = false;
        for (int i = 2; i<=num/2;i++){
            if (num%i == 0){
                isPrime = false;
            }
            break;

        }
        if (isPrime){
            System.out.println(num+" is PRIME");
        }
        else{
            System.out.println(num+" is not PRIME");
        }
    }
}
