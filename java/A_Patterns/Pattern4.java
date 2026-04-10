package A_Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        /*

            Pattern:
                    * * * * *
                  * * * * *
                * * * * *
              * * * * *
            * * * * *

            Analyze:
            row - 5 => n = 5
            col:
            r1 - 9col - 4space - 5*
            r2 - 8col - 3space - 5*
            r3 - 7col - 2space - 5*
            r4 - 6col - 1space - 5*
            r1 - 5col - 0space - 5*

            Formula:
            Part 1, space print
            for each row -> space = n - row

            Part 2, * print
            for each row -> star = n
        */


        int n = 5;

        // for each row
        for (int i = 1; i <= n; i++) {

            // Space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
