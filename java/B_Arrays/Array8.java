package B_Arrays;

public class Array8 {
    public static void main(String[] args) {

//        Sum of 2-D array elements
        int[][] jaggedArr = {
                {1, 2, 3},
                {5, 6},
                {9, 4, 8, 7}
        };

        int sum = 0;
        for (int i = 0; i <= jaggedArr.length-1; i++) {
            for (int j = 0; j <= jaggedArr[i].length-1; j++) {
                sum += jaggedArr[i][j];
            }
            System.out.println();
        }

        System.out.println("The sum of jagged array elements: "+sum);
    }
}
