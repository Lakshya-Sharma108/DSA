package F_ArrayProblems.Part4;

import java.util.HashMap;

public class Practice4 {
    public static void main(String[] args) {

        // Find first repeating element

        int[] arr = {2, 3, 6, 7, 6, 3, 8, 9, 7};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int repElem = 0;
        for (int i : arr){
            if (freq.get(i) > 1){
                repElem = i;
                break;
            }
        }

        System.out.println("The first repeating element is: "+repElem);
    }
}
