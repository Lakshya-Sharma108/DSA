package D_BasicMath;

public class Practice9 {
    public static void main(String[] args) {

//        Perfect Number:

//        A perfect number is a number whose sum of proper divisors equals the number itself
//        n = 6;
//        1. 6x1 = 6
//        2. 2x3 = 6
//        3. 3x2 = 6
//
//        1 + 2 + 3 = 6

        int n = 6;
        int org = n;
        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0){
                int firstFactor = i;
                int secondFactor = n/i;
                sum += firstFactor + secondFactor;
            }
        }

        if (org == sum){
            System.out.println("The number is perfect");
        }else System.out.println("The number is not perfect");
    }
}
