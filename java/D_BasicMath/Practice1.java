package D_BasicMath;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        /*
            Print each number separately of a number -> 5679 -> 5, 6, 7, 9

            Approach:
            if we do number%10 -> it gives you the last digit of a number
            if we do number/10 -> it removes the last digit of a number
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        while (num > 0){
            int digit = num%10;
            num/=10;
            System.out.print(digit+", ");
        }
    }
}
