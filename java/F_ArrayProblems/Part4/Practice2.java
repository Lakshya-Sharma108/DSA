package F_ArrayProblems.Part4;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {

        // Three sum -- find 3 elements (triplet) whose sum is equal to targeted value


        int[] arr = {2, 3, 5, 4, 6, 4, 1, 9, 5, 3, 2};

        // targeted value = 10
        int target = 10;


        List<List<Integer>> output = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        output.add(temp);
                    }
                }
            }
        }

        System.out.println(output);
    }
}
