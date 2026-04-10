package A_Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        /*
            Pattern:
            *
            * *
            *   *
            *     *
            * * * * *

            Analyze:
            row = 5 -> n = 5
            col:
            r1 = col1
            r1 = col2
            r3 = col1 - space1 - col1
            r4 = col1 - space2 - col1
            r5 = col5
        */


        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2 || i == n){
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");

                for (int j = 1; j <= (i-2); j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
