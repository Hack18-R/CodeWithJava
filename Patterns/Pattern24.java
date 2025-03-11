package Patterns;

/*
 
     *    
    ***   
   *****  
  ******* 
 *********

*/

public class Pattern24 {
    public static void main(String[] args) {

        // Initialize variable
        int n = 5;

        // Logic

        // Method 1
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            // First triangle with star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Second traingle with star
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Method 2
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            // two traingle with stars
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
