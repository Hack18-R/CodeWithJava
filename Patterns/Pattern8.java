package Patterns;

/*

          1     
        2 1 2   
      3 2 1 2 3 
    4 3 2 1 2 3 4     
  5 4 3 2 1 2 3 4 5   
6 5 4 3 2 1 2 3 4 5 6 

*/
public class Pattern8 {

    public static void main(String[] args) {

        // Initilize variable
        int n = 6;

        // Logic

        // This loop will print spaces with two spaces given in print
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // This loop will print half the traingle(left side)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // This loop will print other half the traingle(right side)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
