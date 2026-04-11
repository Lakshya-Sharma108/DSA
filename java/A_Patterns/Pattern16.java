package A_Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        /*
            Pattern:
            A
            A B
            A B C
            A B C D
            A B C D E

            Analyze:
            Each row contains the row number of column
            Each row contains the alphabets, starting from A

            We can print it using ASCII value of alphabets

        */

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
