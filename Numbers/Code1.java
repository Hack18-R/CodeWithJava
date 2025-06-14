package Numbers;

//Write a Java program to check whether a given number is even or odd.

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {

        // Attributes
        int num;

        // scanner object
        Scanner scan = new Scanner(System.in);

        // Taking User Input
        System.out.println("Enter the number");
        num = scan.nextInt();

        // checking even or odd number
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }

        // closing scan
        scan.close();
    }
}
