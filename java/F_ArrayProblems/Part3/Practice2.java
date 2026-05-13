package F_ArrayProblems.Part3;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

         /*
            Given array contains n distinct numbers taken from 0,1,2,....n  find the one that is missing from the array


            Approach 1: if we do sum of all elements of array and also the sum of all elements within range

            Example:
            array(0-5 range)    -> {0, 2, 4, 1, 3}    =>  10
            elements(0-5 range) -> {0, 1, 2, 3, 4, 5} =>  15

            Now compare them 10 and 15 and
            15 - 10 = 5
            5 is the missing element



            Approach 2: if we XOR of all elements of array with the of all elements within range

            We know that XOR (^) cancel outs same elements and keeps only unique one

            Now compare them 10 and 15 and
            15 ^ 10 = 5
            5 is the missing element

         */


        int[] arr = {0, 2, 4, 1, 3};

        int xorSum = 0;

        for (int n : arr){
            xorSum = xorSum ^ n;
        }

        int n = arr.length;
        for (int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        System.out.println("The missing element is: "+xorSum);

    }
}
