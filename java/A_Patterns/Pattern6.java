package A_Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        /*

            Pattern:
                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *

            Analyze:
            row = 5 -> n = 5 -> row = n
            col:
            r1 -> 4space -> 1*
            r2 -> 3space -> 3*
            r3 -> 2space -> 5*
            r4 -> 1space -> 7*
            r5 -> 0space -> 9*

            Part 1, space print
            for each row -> space = n-r

            Part 2, star print
            for each row -> star = (2 x r) - 1
        */


        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // Star
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
