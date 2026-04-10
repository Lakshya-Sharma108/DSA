package A_Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        /*
           Pattern:
                      *
                    *   *
                  *       *
                *           *
                  *       *
                    *   *
                      *


           Analyze:
           We can break it into two parts
           1. Upper half -> we did it in Pattern10.java
           2. Lower half -> trying to make it




        */


        int n = 4;

//        Upper half
        for (int i = 1; i <= n; i++) {
            //First spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            if (i == 1){
                for (int j = 1; j <= (2*i)-1; j++) {
                    System.out.print("* ");
                }
            }else {
                System.out.print("* ");

                // Inside spaces
                for (int j = 1; j <= (2*i)-3; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
        
        
//        Lower half
        for (int i = 1; i <= n-1 ; i++) {

            // part 1 -> spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // part 2 -> stars
            if (i == (n-1)){
                System.out.print("* ");
            }else {
                System.out.print("* ");

                for (int j = 1; j <= 2*(n-i)-3; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
