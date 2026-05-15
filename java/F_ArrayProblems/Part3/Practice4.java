package F_ArrayProblems.Part3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Practice4 {
    public static void main(String[] args) {

        // Union of Arrays

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> unionSet = new LinkedHashSet<>();

        for (int num : array1) unionSet.add(num);
        for (int num : array2) unionSet.add(num);

        System.out.println("Array 1: ");
        for (int num : array1) System.out.print(num + " ");

        System.out.println("\nArray 2: ");
        for (int num : array2) System.out.print(num + " ");

        System.out.println("\nUnion: ");
        for (int num : unionSet) System.out.print(num + " ");



    }
}
