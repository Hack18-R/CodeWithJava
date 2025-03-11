package Patterns;

/*

     *    
    * *   
   *   *  
  *     * 
 *       *

*/

public class Pattern26 {
    public static void main(String[] args) {

        // Initialize variable
        int n = 5;

        // Logic
        for (int i = 1; i <= n; i++) {
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
