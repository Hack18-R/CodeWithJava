package Patterns;

/*

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

*/
public class Pattern1 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 5;

        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
