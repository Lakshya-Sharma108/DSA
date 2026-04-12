package B_Arrays;

public class Array6 {
    public static void main(String[] args) {
        /*
            2D Arrays: -- An array of arrays is called 2D array.

            How a 2-dimensional array looks like:

                                col0   col1   col2
                           row0   2      3      4
            int[] arr =    row1   5      6      7
                           row2   9      1      8

            If you want to access a value => arr[row][col];
            arr[0][1] = 3
            arr[2][2] = 8

         */


//        Declaration:
        int[][] matrix;
        matrix = new int[3][3];


//        Initialization:
        int[][] matrix2 = {
                            {1, 2, 3},
                            {5, 6, 7},
                            {9, 4, 8}
                          };

//        Accessing value by index:
//        System.out.println(matrix2[1][1]);
//        System.out.println(matrix2[0][2]);
//        System.out.println(matrix2[2][0]);



//        Printing entire array value
        for (int i = 0; i <= matrix2.length-1; i++) {
            for (int j = 0; j <= matrix2[i].length-1; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
