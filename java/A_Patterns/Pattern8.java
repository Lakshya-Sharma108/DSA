package A_Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        /*
            Pattern:
            * * * * * *
            *         *
            *         *
            * * * * * *


            Analyze:
            Part 1:
            if row == 1 or n -> * in all column

            Part 2:
            if row == 2 to n -1 -> * == col 1 and last


        */


        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == n){
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == 6){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
