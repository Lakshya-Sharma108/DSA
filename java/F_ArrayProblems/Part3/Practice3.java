package F_ArrayProblems.Part3;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        // Given an array contains each element twice except one, find that unique one

        int[] arr = {2, 5, 4, 5, 3, 4, 2, 6, 6};

        int xorSum = 0;

        for (int n : arr){
            xorSum = xorSum ^ n;
        }

        System.out.println(xorSum);
    }
}
