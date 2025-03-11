package Basic;

// Java program to swap two numbers without using tempory variable

import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {

        // Declare variable
        int num1;
        int num2;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the first number");
        num1 = scan.nextInt();
        System.out.println("Enter the second number");
        num2 = scan.nextInt();
        // Logic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Print value of num1 and num2 after swap
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // closing scan object
        scan.close();
    }
}
