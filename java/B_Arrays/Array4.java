package B_Arrays;

public class Array4 {
    public static void main(String[] args) {

//        Find the max element in array
        int[] arr = {2, 6, -3, 15, 1, 8, 22};

        int max = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println("The max is: "+arr[max]);
        System.out.println("The index is: "+max);



    }
}
