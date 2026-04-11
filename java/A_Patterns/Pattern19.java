package A_Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        /*
            Pattern:
                   1
                 2 2 2
               3 3 3 3 3
             4 4 4 4 4 4 4

             Analyze:
             We can break it into 2 parts
             1. space triangle -> n-row
             2. number pyramid

             Each row contains the increasingly odd number of columns 1 - 7

        */

        int n = 4;

        for (int i = 1; i <= n; i++) {

            //part 1
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
