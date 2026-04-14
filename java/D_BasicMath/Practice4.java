package D_BasicMath;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

//        Palindrome number:

//        Approach: reverse and store -> compare original and reversed number

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int org = num;
        int revNum = 0;

        while (num != 0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num /= 10;
        }

        if (org == revNum){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }
    }
}
