package Numbers;

//Write a Java program to check whether a given number is a prime number or not.

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {

        // Attributes
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the number");
        num = scan.nextInt();

        // Checking prime or not
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

        // closing scan
        scan.close();
    }
}
