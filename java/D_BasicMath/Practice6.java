package D_BasicMath;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {

//        GCD (Greatest Common Divisor) or HCF (Highest Common Factor)
//        Formula = gcd(a, b) = gcd(b, a%b)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        while (b != 0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }

        int ans = a;
        System.out.println("The greatest common divisor is: "+ans);
    }
}
