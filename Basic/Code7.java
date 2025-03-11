package Basic;

// Java program to find the number of integers divisible by 5

import java.util.Scanner;

public class Code7 {

    public static void main(String[] args) {

        // Declare variable
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take userinput
        System.out.println("Enter the number");
        num = scan.nextInt();

        // checking is num divisible by 5
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }

        // closing scan object
        scan.close();
    }
}
