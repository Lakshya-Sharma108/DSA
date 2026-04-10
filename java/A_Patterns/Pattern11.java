package A_Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        /*
            Pattern:
                    *
                  * * *
                * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *

              Analyze:
              We can break it into 2 parts --
              part1:
              Upper pyramid

              part2:
              Lower pyramid

              And we already have the code of both, just need to put together

        */


        int n = 4;

        // For Upper Pyramid
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


        // // For Lower Pyramid
        for (int i = 1; i <= n; i++) {

            // To skip extra line
            if (i == 1){
                continue;
            }

            //Space
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }

            //Star
            for (int j = 1; j <= (2*n) - (2*i) + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
