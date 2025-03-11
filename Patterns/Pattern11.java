package Patterns;

/*

*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *

 */

public class Pattern11 {
    public static void main(String[] args) {

        // Initialize variable
        int n = 6;

        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Outer loop to handle the lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
