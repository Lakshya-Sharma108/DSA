package D_BasicMath;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

//        Prime number:
//        A number which should be greater than 1 and only Divisible by 1 or itself

        System.out.println(isPrime(17));


    }


    static boolean isPrime(int num){
        for (int i = 2; i <= num-1; i++) {
            if (num%i == 0){
                return false;
            }
        }

        return true;
    }
}
