package Basic;

// Java program to check if two numbers are equals

import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {

        // Declare variable
        int num1;
        int num2;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take userinput
        System.out.println("Enter the first number");
        num1 = scan.nextInt();
        System.out.println("Enter the second number");
        num2 = scan.nextInt();

        // checking is num1 and num2 are equal or not
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        } else {
            System.out.println(num1 + " and " + num2 + " are not equal");
        }

        // clsoing scan object
        scan.close();
    }
}
