package Basic;

// Java program to print multiplication table

import java.util.Scanner;

public class Code10 {

    public static void main(String[] args) {

        // Declare variable
        int table;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take userinput
        System.out.print("Enter the table number: ");
        table = scan.nextInt();

        // Iterating from 1 to 10 using for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + table * i);
        }

        // closing scan object
        scan.close();
    }
}
