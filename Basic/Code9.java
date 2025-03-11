package Basic;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {

        // Declare and Initialize variable
        int digit;
        int lastValue;
        int sum = 0;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take userinput
        System.out.println("Enter the digits");
        digit = scan.nextInt();

        // Checking the digit value is greater than zero using while loop
        while (digit > 0) {
            // Extracting last value from digit
            lastValue = digit % 10;

            // Now adding sum and lastValue
            sum += lastValue;

            // Now reducing digit values
            digit = digit / 10;

        }

        // Printing sum value
        System.out.println("Sum of Digits: " + sum);

        // closing scan object
        scan.close();
    }
}
