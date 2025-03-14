package Patterns;

/*
 
 *       *
  *     * 
   *   *  
    * *   
     *

*/

public class Pattern27 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 5;

        // Logic
        for (int i = 5; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                if (j > 1 && j < (2 * i) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
