package Basic;

//Java Program to Find the Sum of Even and Odd Numbers

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {

        // Declare variable
        int num;

        // Initialize variable to sum even and odd number
        int sumEven = 0;
        int sumOdd = 0;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // UserInput
        System.out.println("Enter the number");
        num = scan.nextInt();

        // logic
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        // Printing sum value of even and odd
        System.out.println(sumEven);
        System.out.println(sumOdd);

        // closing scan object
        scan.close();
    }
}
