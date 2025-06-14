package Numbers;

//Write a Java program to print all factors (divisors) of a given number.

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {

        // Attribute
        int num;

        // Scan object
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.println("Enter the number");
        num = scan.nextInt();

        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        // closing scan
        scan.close();
    }
}
