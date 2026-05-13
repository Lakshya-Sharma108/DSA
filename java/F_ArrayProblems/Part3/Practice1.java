package F_ArrayProblems.Part3;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        // Given an array of 0's and 1's, sort the array so that all 0's are placed before 1's

        // input  -> {0, 1, 1, 0, 1, 0, 0}
        // output -> {0, 0, 0, 0, 1, 1, 1}

        // We are going to use two pointer technique



        int[] arr = {0, 1, 1, 0, 1, 0, 0};

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            if (arr[start] == 1 && arr[end] == 0){
                // swapping
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            if (arr[start] == 0){
                start++;
            }

            if (arr[end] == 1){
                end--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
