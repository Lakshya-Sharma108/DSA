package A_Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        /*
            Pattern:
                  A
                A B A
              A B C B A
            A B C D C B A

            Analyze:
            We can break it into 3 parts --
            1. space triangle
            2. alphabet triangle
            3. alphabet triangle

            We can print alphabets using ASCII value and type conversion

        */


        int n = 4;

        for (int i = 1; i <= n; i++) {

            //part 1
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //part 2
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64+j)+" ");
            }

            //part 3
            for (int j = i-1; j >= 1; j--) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
