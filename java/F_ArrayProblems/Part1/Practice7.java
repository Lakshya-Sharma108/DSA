package F_ArrayProblems.Part1;

public class Practice7 {
    public static void main(String[] args) {

        // Find 1st unsorted element

        // first array
        //int[] arr = {2, 4, 6, 8, 9, 2, 10, 12};

        // second array
        int[] arr = {12, 10, 8, 6, 10, 4, 2, 1};


        // Checking if array is starting ascending order
        if (arr[1] > arr[0]){
            // code for ascending order
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i-1]){
                    System.out.println("The first unsorted element is: "+arr[i]);
                    System.out.println("The index of element is: "+i);
                }
            }

        }

        // Checking if array is starting descending order
        if (arr[1] < arr[0]) {
            // code for descending order
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i-1]){
                    System.out.println("The first unsorted element is: "+arr[i]);
                    System.out.println("The index of element is: "+i);
                }
            }

        }
    }
}
