package F_ArrayProblems.Part2;

import java.util.Arrays;
import java.util.HashMap;

public class Practice3 {
    public static void main(String[] args) {

        // Identify elements with highest and lowest frequency

        int[] arr = {10, 20, 10, 10, 30, 20, 30, 50, 10, 30, 60, 50};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        int maxFreq = -1;
        int maxFreqKey = -1;

        int minFreq = -1;
        int minFreqKey = -1;

        for (int num : arr){
            frequency.put(num, frequency.getOrDefault(num, 0)+1);

            if (frequency.get(num) > maxFreq){
                maxFreq = frequency.get(num);
                maxFreqKey = num;
            }
        }

        System.out.println(frequency);
        System.out.println("Max frequency key is: "+maxFreqKey+" With frequency: "+maxFreq);
        System.out.println("Min frequency key is: "+minFreqKey+" With frequency: "+minFreq);


    }
}
