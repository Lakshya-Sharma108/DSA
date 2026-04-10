package A_Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*
            Pattern:
            * * * * * * *
              * * * * *
                * * *
                  *

            Analyze:
            row = 4 -> n = 4
            col:
            r1 -> 0space -> 7*
            r2 -> 1space -> 5*
            r3 -> 2space -> 3*
            r4 -> 3space -> 1*

            Part 1, space
            for each row -> space = r-1

            Part 2, star
            for each row -> star = 2 x n - r - space
                         => space = r - 1
                         => 2 x n - r - [r - 1]
                         => (2 x n) - (2 x r) + 1

        */


        int n = 4;

        for (int i = 1; i <= n; i++) {

            //Space
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }

            //Star
            for (int j = 1; j <= (2*n) - (2*i) + 1; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
