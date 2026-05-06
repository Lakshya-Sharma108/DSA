package F_ArrayProblems.Part1;

public class Practice4 {
    public static void main(String[] args) {

        // Find the maximum element in array

        int[] arr = {3, 4, 7, 20, 1, 99, 55};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The max element is: "+max);
    }
}
