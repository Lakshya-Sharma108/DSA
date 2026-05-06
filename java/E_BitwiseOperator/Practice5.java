package E_BitwiseOperator;

public class Practice5 {
    public static void main(String[] args) {

        // Find unique elements


        int[] arr = {3, 5, 3, 7, 5, 9, 7};
        int unique = 0;

        for (int num: arr) {
            unique ^= num;
        }

        System.out.println(unique);
    }
}
