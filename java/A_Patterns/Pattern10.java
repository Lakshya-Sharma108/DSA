package A_Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        /*
            Pattern:
                    *
                  *   *
                *       *
              *           *
            * * * * * * * * *

            row = 5 -> n = 5
            col:
            r1 -> 1*
            r2 -> 1* - 1space - 1*
            r3 -> 1* - 3space - 1*
            r4 -> 1* - 5space - 1*
            r5 -> 9*

            part1:
            if:  r == 1 or r == n -> * = 2r-1

            part2:
            else:  1* -> space = 2r-3 -> 1*


        */

        int n = 10;

        for (int i = 1; i <= n; i++) {
            //First spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            if (i == 1 || i == n){
                for (int j = 1; j <= (2*i)-1; j++) {
                    System.out.print("* ");
                }
            }else {
                System.out.print("* ");

                // Inside spaces
                for (int j = 1; j <= (2*i)-3; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
