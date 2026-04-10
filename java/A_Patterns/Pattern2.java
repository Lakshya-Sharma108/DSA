package A_Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        /*
            Pattern:
            * * * * *
            * * * * *
            * * * * *
        */

        int n = 3;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
