package A_Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        /*
            Pattern:
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

            Analyze:
            Each row has the value of its own
            like: col1 = 1
                  col2 = 2
                  col3 = 3...

            We just need to print the column number

        */


        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
