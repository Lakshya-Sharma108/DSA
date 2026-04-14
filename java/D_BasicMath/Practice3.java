package D_BasicMath;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

//        Reverse a number:

//        Approach:
//        if we do number%10 -> it gives you the last digit of a number
//        revNum = revNum*10 + lastDigit;
//        if we do number/10 -> it removes the last digit of a number

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int revNum = 0;

        while (num != 0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number is: "+revNum);
    }
}
