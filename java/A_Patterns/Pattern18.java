package A_Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        /*
            Pattern:
                  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1

            Analyze:
            We can break it into 3 parts --
            1. space triangle
            2. number triangle
            3. number triangle

        */

        int n = 8;

        for (int i = 1; i <= n; i++) {

            //part 1
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //part 2
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            //part 3
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
