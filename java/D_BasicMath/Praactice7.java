package D_BasicMath;

import java.util.Scanner;

public class Praactice7 {
    public static void main(String[] args) {

//        Armstrong number:
//        Armstrong numbers = the sum of cube of digits of a number is equal to the number
//        153 => (1*1*1) + (5*5*5) + (3*3*3)
//        153 = 153   so 153 is a armstrong number


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int org = num;

        int armStrong = 0;

        while (num != 0){
            int digit = num%10;
            armStrong += (digit*digit*digit);
            num /= 10;
        }

        if (armStrong == org){
            System.out.println("This is a armstrong number!");
        }System.out.println("This is not a armstrong number!");
    }
}
