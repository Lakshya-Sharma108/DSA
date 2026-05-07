package F_ArrayProblems.Part1;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {

        // Print alternate extreme elements of array

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr.length];

        int start = 0;
        int end = (arr.length - 1);

        for (int i = 0; i < arr.length; i += 2) {
            arr2[i] = arr[start];
            arr2[i+1] = arr[end];

            if (start == (arr.length/2)){
                break;
            }

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr2));
    }
}
