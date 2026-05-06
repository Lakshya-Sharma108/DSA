package F_ArrayProblems.Part1;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {

        // Swap alternate elements

        int[] arr = {2, 4, 3, 5, 6, 8, 7, 9};

        int first = 0;
        int second = 1;

        int firstVal;
        int secondVal;

        for (int i = 0; i < arr.length; i++) {

            // swap
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

            if (second == arr.length-1){
                break;
            }else {
                first += 2;
                second += 2;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
