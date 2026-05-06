package F_ArrayProblems.Part1;

public class Practice6 {
    public static void main(String[] args) {

        // Count the number of zero's and one's

        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1};

        int zeroCount = 0;
        int oneCount = 0;

        for (int num : arr){
            if (num == 1){
                oneCount++;
            }else zeroCount++;
        }

        System.out.println("Count of ones: "+oneCount);
        System.out.println("Count of zero: "+zeroCount);
    }
}
