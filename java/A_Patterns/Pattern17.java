package A_Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        /*
            Pattern:
            E
            E D
            E D C
            E D C B
            E D C B A

            Analyze:
            Each row contains the row number of columns
            Each row contains the alphabets backwardly starting from E - A

        */

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(70-j)+" ");
            }
            System.out.println();
        }
    }
}
