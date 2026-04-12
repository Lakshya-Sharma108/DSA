package B_Arrays;

public class Array5 {
    public static void main(String[] args) {

//        Find the min element in array
        int[] arr = {2, 6, -3, 15, -11, 8, 22};

        int min = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] < arr[min]){
                min = i;
            }
        }
        System.out.println("The min is: "+arr[min]);
        System.out.println("The index is: "+min);



    }
}
