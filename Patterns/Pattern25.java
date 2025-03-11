package Patterns;

/*

 *********
  ******* 
   *****  
    ***   
     *

*/

public class Pattern25 {
    public static void main(String[] args) {

        // Initialize variable
        int n = 5;

        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Method 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * n - i; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
