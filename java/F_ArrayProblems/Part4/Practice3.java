package F_ArrayProblems.Part4;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {

        // Remove duplicates from sorted array

        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6};

        int i = 0;
        int j = 1;
        int n = arr.length;

        while (j < n){
            if (arr[i] == arr[j]){
                j++;
            }else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        System.out.println(i+1);

    }
}
