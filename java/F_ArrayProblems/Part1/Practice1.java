package F_ArrayProblems.Part1;

public class Practice1 {
    public static void main(String[] args) {

        // Find the average of array elements

        // Formula:
        // Average = sum of all elements / total number of elements

        int[] arr = {2, 4, 1, 3};
        System.out.println("Average: "+average(arr));

    }

    public static double average(int[] arr){

        double sum = 0;
        int size = arr.length;
        for (int num : arr){
            sum += num;
        }

        double average = sum / size;
        return average;
    }
}
