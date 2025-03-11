package Patterns;

/*

     ******
    ******
   ******
  ******
 ******
******

*/

public class Pattern9 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 6;

        // Logic

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
