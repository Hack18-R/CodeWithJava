package Patterns;

/*

*   *
 * * 
  *  
 * * 
*   *

*/

public class Pattern28 {
    public static void main(String[] args) {

        // Initialize variable
        int n = 5;

        // Logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
