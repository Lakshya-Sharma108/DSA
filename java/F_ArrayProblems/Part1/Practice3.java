package F_ArrayProblems.Part1;

public class Practice3 {
    public static void main(String[] args) {

        // Search for an element in an array {Linear Search}

        int[] arr = {55, 23, 64, 86, 11, 77, 49};

        boolean isThere = false;
        int target = 99;

        for (int num : arr) {
            if (num == target) {
                isThere = true;
                break;
            }
        }

        System.out.println("Element exists! "+isThere);
    }
}
