package F_ArrayProblems.Part2;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        // Reverse an array  -- two pointer technique

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int i = 0;
        int j = (arr.length-1);

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
