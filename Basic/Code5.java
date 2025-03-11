package Basic;

// Java program swap two number using tempory variable 

import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {

        // Declare variables
        int num1;
        int num2;
        int temp;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the first number");
        num1 = scan.nextInt();
        System.out.println("Enter the second number");
        num2 = scan.nextInt();

        // Logic
        temp = num1;
        num1 = num2;
        num2 = temp;

        // print value after swap
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // closing scan object
        scan.close();
    }
}
