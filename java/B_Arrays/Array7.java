package B_Arrays;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {

//        Taking input for 2-D array:
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println("inputs for array "+i);
            for (int j = 0; j <= arr[i].length-1; j++) {
                System.out.print("Enter the value for "+j+" index: ");
                arr[i][j] = input.nextInt();
            }
        }


//        Printing the array
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
