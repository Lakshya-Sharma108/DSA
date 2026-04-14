package D_BasicMath;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

//        Count all digits of a number:

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int count = 0;
        while (num != 0){
            int digit = num%10;
            num/=10;
            count += digit;
        }
        System.out.print("The sum of digits is: "+count);
    }
}
