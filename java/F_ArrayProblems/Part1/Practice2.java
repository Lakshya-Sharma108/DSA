package F_ArrayProblems.Part1;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        // Multiply each element of array by 10

        int[] inputArr = {2, 3, 4, 5, 6};
        int[] outputArr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            outputArr[i] = inputArr[i]*10;
        }

        System.out.println(Arrays.toString(outputArr));
    }
}
