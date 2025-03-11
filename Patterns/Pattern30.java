package Patterns;

/*

******
***** 
****  
***   
**    
*     
**
***
****
*****
******

*/

public class Pattern30 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 6;

        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
