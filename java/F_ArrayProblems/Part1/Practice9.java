package F_ArrayProblems.Part1;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {

        // Print array intersection elements or same elements

        int[] arr = {2, 4, 3, 5, 6, 8, 7, 9};
        int[] arr2 = {1, 11, 3, 7, 9, 14, 4, 19};

        int[] outputArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr2[j] == arr[i]){
                    outputArr[i] = arr2[j];
                }
            }
        }

        System.out.println("Same elements: "+Arrays.toString(outputArr));

    }
}
