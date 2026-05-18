package F_ArrayProblems.Part4;

import java.util.HashMap;

public class Practice5 {
    public static void main(String[] args) {

        /*
             Find Pivot Index

             Pivot Index -> sum of left side element is equal sum of right side elements, that index is called Pivot number


             int[] arr = {1, 7, 3, 6, 5, 6};

             left side =>  1 + 7 + 3 = 11
             right side =>     5 + 6 = 11

             so the Pivot number is 6


             Approach:
             left side sum  ->   |  1  |  8  |  11  |  17  |  22  |  28  |
             right side sum ->   |  28 | 27  |  20  |  17  |  11  |  6   |
                                                       ^
                                     The exact where sum of both side is equal
                                              This is the Pivot number
        */


        int[] arr = {1, 7, 3, 6, 5, 6};

        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]){
                System.out.println("Pivot Number: "+arr[i]+"\nPivot Index: "+i);
                break;
            }
        }
    }
}
