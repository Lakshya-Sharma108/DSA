package F_ArrayProblems.Part2;

import java.util.HashMap;

public class Practice4 {
    public static void main(String[] args) {

        // Find the mod of an array -- the element which appears the most is called mod

        int[] arr = {1, 2, 3, 2, 3, 1, 4, 4, 4, 5, 2, 1, 5, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+ 1);
        }

        System.out.println(freq);
        
    }
}
