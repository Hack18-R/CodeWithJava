package Basic;

import java.util.Scanner;

//Java Program to Check Whether a Number is Positive or Negative

public class Code3 {

    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scan.nextInt();

        if (num > 0) {
            System.out.println("The number is positive ");
        } else if (num < 0) {
            System.out.println("The number is negative ");
        } else {
            System.out.println("The number is neighter postive nor negative");
        }

        scan.close();
    }
}
