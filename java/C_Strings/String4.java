package C_Strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {

        /*
            String Input:
            We have 2 methods to take string input --
            1. next():
            It only takes one word as input, the moment you give it a space it stops taking input

            2. nextLine():
            It can take a input of paragraph, no problem with spaces

        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input: ");
//        String input1 = sc.next();  // it will only take first one word
//        System.out.println("Your input is: "+ input1);

        String input2 = sc.nextLine();  // it can take whatever you give
        System.out.println("Your input is: "+ input2);
    }
}
