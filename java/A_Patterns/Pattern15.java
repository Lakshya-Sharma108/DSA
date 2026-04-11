package A_Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        /*
            Pattern:
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15

            Analyze:
            Each row has the row number of column
            and print numbers 1 - 15

            We can take a count from 1 and increase it by 1 after print

        */

        int n = 5;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
