package F_ArrayProblems.Part1;

public class Practice5 {
    public static void main(String[] args) {

        // Sum of positive and negative numbers

        int[] arr = {3, -2, -1, 5, -4, 7, 8, -3};

        int posSum = 0;
        int negSum = 0;

        for (int num : arr){
            if (num > 0){
                posSum += num;
            }else negSum += num;
        }

        System.out.println("Sum of +ve numbers: "+posSum);
        System.out.println("Sum of -ve numbers: "+negSum);
    }
}
