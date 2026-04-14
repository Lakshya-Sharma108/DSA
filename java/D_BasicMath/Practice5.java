package D_BasicMath;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

//        Prime number:
//        A number which should be greater than 1 and only Divisible by 1 or itself

//        To make it faster we can iterate till -> square root of num or (i*i <= n)

        System.out.println(isPrime(12));


    }


    static boolean isPrime(int num){
//        Faster version
        for (int i = 2; i*i <= num; i++) {
            if (num%i == 0){
                return false;
            }
        }

//        for (int i = 2; i <= num-1; i++) {
//            if (num%i == 0){
//                return false;
//            }
//        }

        return true;
    }
}
