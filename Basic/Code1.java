package Basic;

import java.util.Scanner;

//Java Program to Check Whether a Given Number is Even or Odd

public class Code1 {

    public static void main(String[] args) {

        // Declare variable
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take userinput
        System.out.println("Enter the number");
        num = scan.nextInt();

        // Logic
        // checking even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }

        // closing scan object
        scan.close();
    }
}