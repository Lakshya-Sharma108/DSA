package F_ArrayProblems.Part4;

public class Practice1 {
    public static void main(String[] args) {

        // Two sum -- find a pair whose sum is equal to targeted value


        int[] arr = {2, 3, 5, 4, 6};

        // targeted value = 10
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    continue;
                }
                if ((arr[i]+arr[j]) == target){
                    System.out.println("targeted elements are: "+arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
