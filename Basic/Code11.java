package Basic;

// Java Program to check whether a character is a vowel,consonant or Digit

import java.util.Scanner;

public class Code11 {

    public static void main(String[] args) {

        // Declare variable
        char ch;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take userinput
        System.out.println("Enter the character");
        ch = scan.next().charAt(0);

        // Checking the ch is digit or vowel or consonant
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u'
                || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println(ch + " is neigther a digit,vowel,nor consonant");
        }

        // closing scan object
        scan.close();
    }
}
