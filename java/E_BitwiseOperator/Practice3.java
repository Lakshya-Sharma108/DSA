package E_BitwiseOperator;

public class Practice3 {
    public static void main(String[] args) {
        // Power of 2 with second formula --

        // Formula:
        // if   n & (n-1) == 0   then number is power of 2

        int n = 15;
        if ((n & (n-1)) == 0){
            System.out.println("The number is power of 2");
        }else System.out.println("The number is not power of 2");
    }
}
