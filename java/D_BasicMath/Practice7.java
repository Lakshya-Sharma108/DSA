package D_BasicMath;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

//        LCM of a number:

//        LCM x HCF (gcd) = axb
//        LCM = axb/gcd

//        Code to find GCD
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        int ab = a*b;

        while (b != 0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }

        int gcd = a;

        int lcm = ab/gcd;

        System.out.println("LCM of the numbers is: "+lcm);
    }
}
