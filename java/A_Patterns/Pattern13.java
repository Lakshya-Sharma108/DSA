package A_Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        /*
            Pattern:
             *                 *
             * *             * *
             * * *         * * *
             * * * *     * * * *
             * * * * * * * * * *
             * * * * * * * * * *
             * * * *     * * * *
             * * *         * * *
             * *             * *
             *                 *


             Analyze:
             We can break it into 6 parts
             Upper half: 1-star triangle -> 1-space triangle -> 1-star triangle
             Lower half: 1-star triangle -> 1-space triangle -> 1-star triangle


        */



        // Upper half:
        int n = 10;

        for (int i = 1; i <= n; i++) {

            //part 1
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            //part 2
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }

            //part 3
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        // Lower half
        for (int i = 1; i <= n; i++) {

            //part 1
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }

            //part 2
            for (int j = 1; j <= 2*(i-1); j++) {
                System.out.print("  ");
            }

            //part 3
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
