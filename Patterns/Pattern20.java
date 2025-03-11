package Patterns;

/*

 ***********
  *       * 
   *     *  
    *   *   
     * *    
      * 

*/

public class Pattern20 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 6;

        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * n - 1; j >= 2 * i - 1; j--) {
                if (i == 1 || i == n || j == 2 * n - 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}