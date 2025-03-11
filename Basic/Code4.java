package Basic;

// Java Program to Find the Largest Number Among Three Numbers

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {

        // Declare variables
        int num1;
        int num2;
        int num3;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the first number");
        num1 = scan.nextInt();
        System.out.println("Enter the second number");
        num2 = scan.nextInt();
        System.out.println("Enter the thrid number");
        num3 = scan.nextInt();

        // Logic
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }

        // closing scan object
        scan.close();
    }
}
